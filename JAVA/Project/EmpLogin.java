
import java.awt.*;
import java.sql.*;
import javax.sql.*;
import java.awt.event.*;

public class EmpLogin extends Frame
{	
  Label l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13,l14,l15,l16,l17,l18,l19,l20,l21,l22,l23,l24;
  TextField t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,t11,t12;
  Button b1,b2,b3,b4,b5;
  Connection con;

  public EmpLogin()
  {
    super("Emp_Login");
    setVisible(true);
    setSize(1366,768);
    setLocation(5,5);
    setBackground(Color.LIGHT_GRAY);
    setLayout(null);
    Font f=new Font("timesnewromon",Font.BOLD,20);

    l1=new Label("Login for View Employee Details");
    add(l1);
    l1.setSize(400,70);
    l1.setLocation(500,30);
    Font f1=new Font("timesnewromon",Font.BOLD,25);
    l1.setFont(f1);

    l2=new Label("Employee Number");
    add(l2);
    l2.setSize(180,30);
    l2.setLocation(350,100);
    l2.setFont(f);

    t1=new TextField();
    add(t1);
    t1.setSize(200,30);
    t1.setLocation(550,100);

    b1=new Button("Ok");
    add(b1);
    b1.setSize(80,40);
    b1.setLocation(780,100);
    b1.setFont(f);
    b1.setVisible(true);

    b2=new Button("Cancel");
    add(b2);
    b2.setVisible(true);
    b2.setSize(100, 40);
    b2.setLocation(900, 100);
    b2.setFont(f);

	b3=new Button("Back");
    add(b3);
    b3.setVisible(true);
    b3.setSize(100, 40);
    b3.setLocation(1050, 100);
    b3.setFont(f);

	b4=new Button("Edit");
    //add(b4);
    b4.setVisible(true);
    b4.setSize(100, 40);
    b4.setLocation(470,700);
    b4.setFont(f);

	b5=new Button("Update");
    //add(b5);
    b5.setVisible(true);
    b5.setSize(100, 40);
    b5.setLocation(670,700);
    b5.setFont(f);

    l3=new Label("Empolyee Number");
    //add(l3);
    l3.setVisible(true);
    l3.setSize(200, 30);
    l3.setLocation(400, 160);
    l3.setFont(f);
    
    l4=new Label("Full Name");
    //add(l4);
    l4.setVisible(true);
    l4.setSize(200,30);
    l4.setLocation(400,210);
    l4.setFont(f);
    
    l5=new Label("Father's Name");
   // add(l5);
    l5.setVisible(true);
    l5.setSize(200, 30);
    l5.setLocation(400,260);
    l5.setFont(f);
    
    l6=new Label("Date of Birth");
    //add(l6);
    l6.setVisible(true);
    l6.setSize(200, 30);
    l6.setLocation(400, 310);
    l6.setFont(f);
    
    l7=new Label("Gender");
    //add(l7);
    l7.setVisible(true);
    l7.setSize(200, 30);
    l7.setLocation(400, 360);
    l7.setFont(f);
    
    l8=new Label("Permanent Address");
    //add(l8);
    l8.setVisible(true);
    l8.setSize(200, 30);
    l8.setLocation(400, 410);
    l8.setFont(f);
    
    l9=new Label("Contact Number");
    //add(l9);
    l9.setVisible(true);
    l9.setSize(200,30);
    l9.setLocation(400, 460);
    l9.setFont(f);
    
    l10=new Label("Date of Joining");
   // add(l10);
    l10.setVisible(true);
    l10.setSize(200, 30);
    l10.setLocation(400,510);
    l10.setFont(f);
    
    l11=new Label("Designation");
   // add(l11);
    l11.setVisible(true);
    l11.setSize(200, 30);
    l11.setLocation(400, 560);
    l11.setFont(f);
    
    l12=new Label("Salary");
   // add(l12);
    l12.setVisible(true);
    l12.setSize(200, 30);
    l12.setLocation(400, 610);
    l12.setFont(f);
    
    l13=new Label("Status");
   // add(l13);
    l13.setVisible(true);
    l13.setSize(200, 30);
    l13.setLocation(400,660);
    l13.setFont(f);
    
    l14=new Label();
	//add(l14);
    l14.setVisible(true);
    l14.setSize(300,20);
    l14.setLocation(750,160);
    l14.setFont(f);

	t2=new TextField();
    t2.setSize(200,30);
    t2.setLocation(750,160);
    
    l15=new Label();
    //add(l15);
    l15.setVisible(true);
    l15.setSize(300,20);
    l15.setLocation(750,210);
    l15.setFont(f);

	t3=new TextField();
    t3.setSize(200,30);
    t3.setLocation(750,210);

    l16=new Label();
    //add(l16);
    l16.setVisible(true);
    l16.setSize(300, 20);
    l16.setLocation(750, 260);
	l16.setFont(f);

	t4=new TextField();
    t4.setSize(200,30);
    t4.setLocation(750,260);
    
    l17=new Label();
    //add(l17);
    l17.setVisible(true);
    l17.setSize(300, 20);
    l17.setLocation(750,310);
	l17.setFont(f);

	t5=new TextField();
    t5.setSize(200,30);
    t5.setLocation(750,310);
    
    l18=new Label();
   // add(l18);
    l18.setVisible(true);
    l18.setSize(300, 20);
    l18.setLocation(750,360);
	l18.setFont(f);

	t6=new TextField();
    t6.setSize(200,30);
    t6.setLocation(750,360);
    
    l19=new Label();
    //add(l19);
    l19.setVisible(true);
    l19.setSize(300,20);
    l19.setLocation(750,410);
	l19.setFont(f);

	t7=new TextField();
    t7.setSize(200,30);
    t7.setLocation(750,410);

    l20=new Label();
    //add(l20);
    l20.setVisible(true);
    l20.setSize(300,20);
    l20.setLocation(750, 460);
	l20.setFont(f);

	t8=new TextField();
    t8.setSize(200,30);
    t8.setLocation(750,460);

    l21=new Label();
    //add(l21);
    l21.setVisible(true);
    l21.setSize(300,20);
    l21.setLocation(750, 510);
	l21.setFont(f);

	t9=new TextField();
    t9.setSize(200,30);
    t9.setLocation(750,510);

    l22=new Label();
    //add(l22);
    l22.setVisible(true);
    l22.setSize(300, 20);
    l22.setLocation(750, 560);
	l22.setFont(f);

	t10=new TextField();
    t10.setSize(200,30);
    t10.setLocation(750,560);

    l23=new Label();
    //add(l23);
    l23.setVisible(true);
    l23.setSize(300,20);
    l23.setLocation(750,610);
	l23.setFont(f);

	t11=new TextField();
    t11.setSize(200,30);
    t11.setLocation(750,610);

    l24=new Label();
    //add(l24);
    l24.setVisible(true);
    l24.setSize(300, 20);
    l24.setLocation(750,660);
	l24.setFont(f);

	t12=new TextField();
    t12.setSize(200,30);
    t12.setLocation(750,660);

    EmpD ed=new EmpD(this);
	b1.addActionListener(ed);
    b2.addActionListener(ed);
	b3.addActionListener(ed);
	b4.addActionListener(ed);
	b5.addActionListener(ed);
  }

    public class EmpD implements ActionListener
	{            
       Frame f;
	   String emp;
	   String emp1;
	   String emp2;
	   String emp3;
	   String emp4;
	   String emp5;
	   String emp6;
	   String emp7;
	   String emp8;
	   String emp9;
	   String emp10;
					   
      public EmpD( Frame f1)
      {
        this.f=f1;
      }
      public void actionPerformed (ActionEvent ae)
      {
         //OK Button
        if(ae.getSource()==b1)
        {
		  String s1=t1.getText();
          try
          {
             Class.forName("com.mysql.jdbc.Driver");
             con= DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","123");
			 Statement stmt=con.createStatement();
			 ResultSet rs=stmt.executeQuery("select * from addemp where employee_number="+s1+"");
			 while(rs.next())
			 {
			   emp=rs.getString("employee_number");
			   emp1=rs.getString("full_name");
			   emp2=rs.getString("fathers_name");
			   emp3=rs.getString("date_of_birth");
			   emp4=rs.getString("gender");
			   emp5=rs.getString("permanent_address");
               emp6=rs.getString("contact_number");
			   emp7=rs.getString("date_of_joining");
			   emp8=rs.getString("designation");
			   emp9=rs.getString("salary");
			   emp10=rs.getString("status");

			 }
		   } 
               catch(Exception e)
               {
                 System.out.println(e);
               }

                 l14.setText(emp);
				 f.add(l14);
				 f.add(l3);

				 l15.setText(emp1);
				 f.add(l15);
				 f.add(l4);

				 l16.setText(emp2);
				 f.add(l16);
				 f.add(l5);

				 l17.setText(emp3);
				 f.add(l17);
				 f.add(l6);

				 l18.setText(emp4);
				 f.add(l18);
				 f.add(l7);

				 l19.setText(emp5);
				 f.add(l19);
				 f.add(l8);

				 l20.setText(emp6);
				 f.add(l20);
				 f.add(l9);

				 l21.setText(emp7);
				 f.add(l21);
				 f.add(l10);

				 l22.setText(emp8);
				 f.add(l22);
				 f.add(l11);

				 l23.setText(emp9);
				 f.add(l23);
				 f.add(l12);

	         	 l24.setText(emp10);
			     f.add(l24);
				 f.add(l13); 	
						 
				 f.add(b4);
				 f.add(b5);		
            }

			 //Cancel Button
              if (ae.getSource()==b2)
              {
                f.dispose();    
              }

			  //Back Button
              if (ae.getSource()==b3)
              {
                new HomePage();
				f.dispose();
              }

			 //Edit Button
              if (ae.getSource()==b4)
			  {
			    String s1=t1.getText();
                try
                {
                   Class.forName("com.mysql.jdbc.Driver");
                   con= DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","123");
				   Statement stmt=con.createStatement();
				   ResultSet rs=stmt.executeQuery("select * from addemp where employee_number="+s1+"");
				   while(rs.next())
			       {
				     emp=rs.getString("employee_number");
					 emp1=rs.getString("full_name");
					 emp2=rs.getString("fathers_name");
					 emp3=rs.getString("date_of_birth");
					 emp4=rs.getString("gender");
					 emp5=rs.getString("permanent_address");
                     emp6=rs.getString("contact_number");
					 emp7=rs.getString("date_of_joining");
					 emp8=rs.getString("designation");
					 emp9=rs.getString("salary");
					 emp10=rs.getString("status");
				   }
			     }
               
                catch(Exception e)
                {
                  System.out.println(e);
                }	

				  l14.setVisible(false);
				  f.add(t2);
				  t2.setText(emp);

				  l15.setVisible(false);
				  f.add(t3);
				  t3.setText(emp1);

				  l16.setVisible(false);
				  f.add(t4);
				  t4.setText(emp2);

				  l17.setVisible(false);
				  f.add(t5);
				  t5.setText(emp3);

				  l18.setVisible(false);
				  f.add(t6);
				  t6.setText(emp4);

				  l19.setVisible(false);
				  f.add(t7);
				  t7.setText(emp5);
                  
                  l20.setVisible(false);
				  f.add(t8);
				  t8.setText(emp6);

				  l21.setVisible(false);
				  f.add(t9);
				  t9.setText(emp7);

				  l22.setVisible(false);
				  f.add(t10);
				  t10.setText(emp8);

				  l23.setVisible(false);
				  f.add(t11);
				  t11.setText(emp9);

				  l24.setVisible(false);
				  f.add(t12);
				  t12.setText(emp10);
		      }

            //Update Button
			  if(ae.getSource()==b5)
			  { 
	            try
			    {
				   Class.forName("com.mysql.jdbc.Driver");
				   Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","123");
				   PreparedStatement ps;
				   Statement stmt=con.createStatement();     

				   emp1=t3.getText();
				   emp2=t4.getText();
				   emp3=t5.getText();
				   emp4=t6.getText();
				   emp5=t7.getText();
				   emp6=t8.getText();
				   emp7=t9.getText();
				   emp8=t10.getText();
				   emp9=t11.getText();
				   emp10=t12.getText();
						
				   String query="UPDATE addemp SET full_name='"+emp1+"',fathers_name='"+emp2+"',date_of_birth='"+emp3+"',gender='"+emp4+"',permanent_address='"+emp5+"',contact_number='"+emp6+"',date_of_joining='"+emp7+"',designation='"+emp8+"',salary='"+emp9+"',status='"+emp10+"' WHERE employee_number="+emp+"";	
				 //System.out.println(query);
				   stmt.executeUpdate(query);	 			
				}
				catch(Exception e)
				{
				  System.out.println(e);
				}
			  }
            }   
          }      
        }





