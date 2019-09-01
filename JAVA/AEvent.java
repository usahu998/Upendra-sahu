import java.awt.*;
import java.awt.event.*;

class AEvent extends Frame implements ActionListener
{
TextField tf;
Button b;
AEvent()
{
tf=new TextField();
tf.setBounds(70,50,170,20);
add(tf);
b = new Button("click me");
b.setBounds(100,120,80,30);
add(b);
b.addActionListener(this);
setSize(300,300);
setLayout(null);
setVisible(true);
}
public void actionPerformed(ActionEvent e)
{
tf.setText("WELCOME");
}

public static void main(String arg[])
{
new AEvent();
}
} 