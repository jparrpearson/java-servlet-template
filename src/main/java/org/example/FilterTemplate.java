package org.example;

import java.io.IOException;
import java.util.logging.Logger;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpServletResponse;

/**
 * Example servlet filter.
 * 
 * @author Jeremy Parr-Pearson
 * @version 1.0
 */
@WebListener
public class FilterTemplate implements Filter {

    private static final Logger LOG = Logger
            .getLogger(FilterTemplate.class.getName());

    private String headerName;
    private String headerValue;

    @Override
    public void init(FilterConfig cfg) throws ServletException {
        // TODO: Implement filter initialization
        headerName = cfg.getInitParameter("headerName");
        headerValue = cfg.getInitParameter("headerValue");
        LOG.info("Filter initialized");
    }

    @Override
    public void destroy() {
        // TODO: Implement filter cleanup
        LOG.info("Filter destroyed");
    }

    @Override
    public void doFilter(ServletRequest req, ServletResponse rsp,
            FilterChain chain) throws IOException, ServletException {
        // TODO: Implement filtering of request
        LOG.info("Filtering request");
        chain.doFilter(req, rsp);

        // TODO: Implement filtering of response
        LOG.info("Filtering response");
        ((HttpServletResponse) rsp).addHeader(headerName, headerValue);
    }

}
