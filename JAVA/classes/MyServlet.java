import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class MyServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
           
            String user=request.getParameter("user");
			out.println("<input type='checkbox' name='chk_box / >'");
            out.println("<h2> Welcome "+user+"</h2>");
        } finally {            
            out.close();
        }
    }
}
