package org.example;

import java.util.logging.Logger;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class ListenerTemplate implements ServletContextListener {

    private static final Logger LOG = Logger.getLogger(ListenerTemplate.class
            .getName());

    @Override
    public void contextInitialized(ServletContextEvent ctx) {
        LOG.info("Context initialized");
    }

    @Override
    public void contextDestroyed(ServletContextEvent ctx) {
        LOG.info("Context destroyed");
    }

}