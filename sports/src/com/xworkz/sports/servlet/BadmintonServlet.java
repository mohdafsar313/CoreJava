package com.xworkz.sports.servlet;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
@WebServlet(urlPatterns = "/badminton",loadOnStartup = 1)
public class BadmintonServlet extends GenericServlet
{
    public BadmintonServlet(){
        System.out.println("badmintonservlet created by tomcat");
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("running service in badmintonservlet");
    }
}
