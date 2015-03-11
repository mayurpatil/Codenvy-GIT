package cal;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class CalculateServlet extends HttpServlet {
  
  public void doPost(HttpServletRequest req, HttpServletResponse resp) 
    throws ServletException, IOException
      {
      int n1=Integer.parseInt(req.getParameter("num1"));
      int n2=Integer.parseInt(req.getParameter("num2"));
      int result=n1+n2;
      
      resp.setContentType("text/html");
      resp.getWriter().println("The result is"+ result);
    }
}
