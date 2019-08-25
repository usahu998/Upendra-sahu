
import java.sql.*;
import javax.servlet.*;

public class MyListener implements ServletContextListener
{
    ServletContext ctx;
    Connection con;
    Statement s;
    PreparedStatement ps;
    ResultSet rs;
    int count;
    
    public void contextInitialized(ServletContextEvent sce) {
    
    try{
      	Class.forName("com.mysql.jdbc.Driver");
										Connection con = DriverManager.getConnection ("jdbc:mysql://localhost/serv_db","serv_db","serv_db");
										Statement st=con.createStatement();
										ResultSet rs=st.executeQuery("select * from counter");
										while(rs.next())
										{
											count=12;
											
										}
       
       ctx=sce.getServletContext();
	   count=121;
       ctx.setAttribute("pcount", count);
      }
      catch(Exception e){ e.printStackTrace();  
       ctx=sce.getServletContext();
	   count=121;
       ctx.setAttribute("pcount", count); }  
	  
    }

    public void contextDestroyed(ServletContextEvent sce) {
   
    try
     {
       ctx=sce.getServletContext();
       count=(Integer)ctx.getAttribute("pcount");
       ps=con.prepareStatement("update counter set pageview='"+count+"'");
       ps.executeUpdate(); 
     } 
     catch(Exception e){ e.printStackTrace(); }
    }   
}