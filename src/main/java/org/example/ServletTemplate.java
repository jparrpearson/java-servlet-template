package org.example;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Logger;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Example servlet.
 * 
 * @author Jeremy Parr-Pearson
 * @version 1.0
 */
@WebServlet(name = "ServletTemplate", urlPatterns = "/template")
public class ServletTemplate extends HttpServlet {

    private static final long serialVersionUID = 1L;

    private static final Logger LOG = Logger
            .getLogger(ServletTemplate.class.getName());

    private String responseText;

    @Override
    public void init(ServletConfig cfg) throws ServletException {
        super.init(cfg);
        // TODO: Implement servlet initialization
        responseText = cfg.getInitParameter("responseText");
        LOG.info("Servlet initialized");
    }

    @Override
    public void destroy() {
        super.destroy();
        // TODO: Implement servlet cleanup
    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse rsp)
            throws IOException, ServletException {
        // TODO: Implement service method (or individual methods)
        LOG.info("Processing GET request");
        PrintWriter out = rsp.getWriter();
        out.write(responseText);
    }

}
