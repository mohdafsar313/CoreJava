package com.xworkz.sports.servlet;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.util.Locale;

@WebServlet(urlPatterns = "/hockey",loadOnStartup = 1)
public class HockeyServlet extends GenericServlet {
    public HockeyServlet(){
        System.out.println("HockeyServlet created by tomcat");
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("running service in hockeyservlet");
    }
}
