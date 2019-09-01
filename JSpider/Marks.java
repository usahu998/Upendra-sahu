import java.util.Scanner;
class Marks
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);

System.out.println("Enter C marks");
int a=sc.nextInt();
System.out.println("Enter C++ marks");
int b=sc.nextInt();
System.out.println("Enter Java marks");
int c=sc.nextInt();
System.out.println("Enter Python marks");
int d=sc.nextInt();
int total=a+b+c+d;
System.out.println("Total marks is "+total);
int per=(total)/4;
System.out.println("Percentage is "+per+"%");


}
}