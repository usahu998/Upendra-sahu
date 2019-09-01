import java.util.Scanner;

class AreaCircle
{
public static void main(String args[])
{
Scanner sc=new Scanner (System.in);

System.out.println("Enter the radius of circle");
double a=sc.nextDouble();

double area;
area=3.14*a*a;
System.out.println(a+"Area of circle="+area);
}
}