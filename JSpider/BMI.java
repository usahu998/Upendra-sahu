import java.util.Scanner;

class BMI
{
public static void main(String args[])
{
Scanner sc=new Scanner (System.in);

System.out.println("Enter the weight in kg");
double w=sc.nextDouble();
System.out.println("Enter the height in meter");
double m=sc.nextDouble();

double ans=w/(m*m);

System.out.println("Body mass index= " +ans);






}
}