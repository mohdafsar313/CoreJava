package servlet;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/submit")
public class FeedBackServlet extends GenericServlet {

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("running service in feedbackservlet");
       String name= servletRequest.getParameter("name");
        String email= servletRequest.getParameter("email");
        String contactNumber= servletRequest.getParameter("contactnumber");
        String feedback= servletRequest.getParameter("feedback");

        System.out.println(name+" "+email+" "+contactNumber+" "+feedback);

        servletResponse.setContentType("text/html");
        PrintWriter writer= servletResponse.getWriter();
        writer.println(name+" thanks for submitting the feedback.");
    }
}
