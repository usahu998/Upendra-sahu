
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class Counter extends HttpServlet {
   
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        ServletContext ctx = getServletContext();
        Integer count = (Integer)ctx.getAttribute("pcount");
        out.println(count+": pageview");//2 page view
        ctx.setAttribute("pcount", ++count);      
    }
}