
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

public class Registration extends Frame      
{
  Label l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13;
  Button b1,b2;
  TextField t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,t11;
	
	
  public Registration()
  {
    super("Registration");
    setVisible(true);
    setSize(1366,768);
    setLocation(10,10);
    setLayout(null);
    setBackground(Color.LIGHT_GRAY);
    Font f=new Font("timesnewromon",Font.BOLD,20);
    
    l1=new Label("New Employee Registration");
    add(l1);
    l1.setVisible(true);
    l1.setSize(800,50);
    l1.setLocation(480,50);
    Font f1=new Font("timesnewromon",Font.BOLD,30);
    l1.setFont(f1);
    
    l2=new Label("Empolyee Number");
    add(l2);
    l2.setVisible(true);
    l2.setSize(200, 30);
    l2.setLocation(330, 130);
    l2.setFont(f);
    
    l3=new Label("Full Name");
    add(l3);
    l3.setVisible(true);
    l3.setSize(200,30);
    l3.setLocation(330,180);
    l3.setFont(f);
    
    l4=new Label("Father's Name");
    add(l4);
    l4.setVisible(true);
    l4.setSize(200, 30);
    l4.setLocation(330,230);
    l4.setFont(f);
    
    l5=new Label("Date of Birth");
    add(l5);
    l5.setVisible(true);
    l5.setSize(200, 30);
    l5.setLocation(330, 280);
    l5.setFont(f);
    
    l6=new Label("Gender");
    add(l6);
    l6.setVisible(true);
    l6.setSize(200, 30);
    l6.setLocation(330, 330);
    l6.setFont(f);
    
    l7=new Label("Permanent Address");
    add(l7);
    l7.setVisible(true);
    l7.setSize(200, 30);
    l7.setLocation(330, 380);
    l7.setFont(f);
    
    l8=new Label("Contact Number");
    add(l8);
    l8.setVisible(true);
    l8.setSize(200,30);
    l8.setLocation(330, 430);
    l8.setFont(f);
    
    l9=new Label("Date of Joining");
    add(l9);
    l9.setVisible(true);
    l9.setSize(200, 30);
    l9.setLocation(330,480);
    l9.setFont(f);
    
    l10=new Label("Designation");
    add(l10);
    l10.setVisible(true);
    l10.setSize(200, 30);
    l10.setLocation(330, 530);
    l10.setFont(f);
    
    l11=new Label("Salary");
    add(l11);
    l11.setVisible(true);
    l11.setSize(200, 30);
    l11.setLocation(330, 580);
    l11.setFont(f);
    
    l12=new Label("Status");
    add(l12);
    l12.setVisible(true);
    l12.setSize(200, 30);
    l12.setLocation(330,630);
    l12.setFont(f);
    
    l13=new Label("Successfully Submitted");
    l13.setVisible(true);
    l13.setSize(300,30);
    l13.setLocation(850,680);
    l13.setFont(f);
    
    t1=new TextField();
    add(t1);
    t1.setVisible(true);
    t1.setSize(400,20);
    t1.setLocation(530,130);
    
    t2=new TextField();
    add(t2);
    t2.setVisible(true);
    t2.setSize(400, 20);
    t2.setLocation(530, 180);
    
    t3=new TextField();
    add(t3);
    t3.setVisible(true);
    t3.setSize(400, 20);
    t3.setLocation(530,230);
    
    t4=new TextField();
    add(t4);
    t4.setVisible(true);
    t4.setSize(400, 20);
    t4.setLocation(530, 280);
    
    t5=new TextField();
    add(t5);
    t5.setVisible(true);
    t5.setSize(400,20);
    t5.setLocation(530,330);
    
    t6=new TextField();
    add(t6);
    t6.setVisible(true);
    t6.setSize(400,20);
    t6.setLocation(530, 380);
    
    t7=new TextField();
    add(t7);
    t7.setVisible(true);
    t7.setSize(400,20);
    t7.setLocation(530, 430);
    
    t8=new TextField();
    add(t8);
    t8.setVisible(true);
    t8.setSize(400, 20);
    t8.setLocation(530, 480);
    
    t9=new TextField();
    add(t9);
    t9.setVisible(true);
    t9.setSize(400,20);
    t9.setLocation(530,530);
    
    t10=new TextField();
    add(t10);
    t10.setVisible(true);
    t10.setSize(400, 20);
    t10.setLocation(530,580);
    
    t11=new TextField();
    add(t11);
    t11.setVisible(true);
    t11.setSize(400,20);
    t11.setLocation(530,630);
    
    b1=new Button("Register");
    add(b1);
    b1.setVisible(true);
    b1.setSize(100, 40);
    b1.setLocation(500, 680);
    b1.setFont(f);
    
    b2=new Button("cancel");
    add(b2);
    b2.setVisible(true);
    b2.setSize(100, 40);
    b2.setLocation(700, 680);
    b2.setFont(f);

    Add a=new Add(this);
    b1.addActionListener(a);
    b2.addActionListener(a);
  }
    public class Add implements ActionListener
    {
      Frame f; 
      public Add(Frame f1)
      {
       this.f=f1;
      } 
      public void actionPerformed(ActionEvent ae)
      {
        if(ae.getSource()==b1)
	    {
	     try
         {
           Class.forName("com.mysql.jdbc.Driver");
		   Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","123");
		   PreparedStatement ps;
		   Statement st;
		   ps=con.prepareStatement("insert into addemp(employee_number,full_name,fathers_name,date_of_birth,gender,permanent_address,contact_number,date_of_joining,designation,salary,status)values(?,?,?,?,?,?,?,?,?,?,?)");
           ps.setString(1,t1.getText());

		   ps.setString(2,t2.getText());

		   ps.setString(3,t3.getText());      

		   ps.setString(4,t4.getText());

		   ps.setString(5,t5.getText());

		   ps.setString(6,t6.getText());

		   ps.setString(7,t7.getText());

		   ps.setString(8,t8.getText());

		   ps.setString(9,t9.getText());

		   ps.setString(10,t10.getText());

		   ps.setString(11,t11.getText());

		   ps.executeUpdate();
	    }	
		catch(Exception e)
		{
		  System.out.println(e);
		} 
          f.add(l13);  
	  } 
         if(ae.getSource()==b2)
         {
           f.dispose();
         }
	  } 
   }    
 }
