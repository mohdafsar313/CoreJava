package servlet;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/submit")
public class AadharNumberServlet extends GenericServlet {

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("running service in aadharnumberservlet");
        String number=servletRequest.getParameter("number");
        System.out.println(number+" ");

        servletResponse.setContentType("text/html");
        PrintWriter writer = servletResponse.getWriter();
        if (number != null && number.matches("\\d{12}")) {
            writer.println("valid number");
        } else {
            writer.println("invalid number");
        }
    }
}
