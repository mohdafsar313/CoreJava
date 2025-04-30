package com.xworkz.tom.servlet;


import javax.jws.WebService;
import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

@WebServlet(urlPatterns = "/dry",loadOnStartup = 1)
public class DryRunServlet extends GenericServlet {
    public DryRunServlet(){
        System.out.println("dryrunservlet created by tomcat");
    }
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("running service in dryrunservlet");
    }
}
