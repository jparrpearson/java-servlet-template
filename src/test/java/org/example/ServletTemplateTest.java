package org.example;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.junit.Assert;
import org.junit.Test;

public class ServletTemplateTest {

    @Test
    public void testServletResponse() throws IOException, ServletException {
        String responseText = "This is a test!";
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintWriter writer = new PrintWriter(baos);

        ServletConfig config = mock(ServletConfig.class);
        HttpServletRequest request = mock(HttpServletRequest.class);
        HttpServletResponse response = mock(HttpServletResponse.class);
        when(config.getInitParameter("responseText")).thenReturn(responseText);
        when(response.getWriter()).thenReturn(writer);

        ServletTemplate servlet = new ServletTemplate();
        servlet.init(config);
        servlet.service(request, response);
        // Ensure the response output is flushed
        writer.flush();

        Assert.assertEquals(responseText, baos.toString());
    }

}
