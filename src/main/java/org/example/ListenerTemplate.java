package org.example;

import java.util.logging.Logger;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

/**
 * Example context listener.
 * 
 * @author Jeremy Parr-Pearson
 * @version 1.0
 */
@WebListener
public class ListenerTemplate implements ServletContextListener {

    private static final Logger LOG = Logger
            .getLogger(ListenerTemplate.class.getName());

    @Override
    public void contextInitialized(ServletContextEvent ctx) {
        // TODO: Implement listener initialization
        LOG.info("Context initialized");
    }

    @Override
    public void contextDestroyed(ServletContextEvent ctx) {
        // TODO: Implement listener cleanup
        LOG.info("Context destroyed");
    }

}
