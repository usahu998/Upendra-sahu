import java.util.Scanner;
class Rectangle
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);

System.out.println("Enter Length");
int a=sc.nextInt();
System.out.println("Enter Breadth");
int b=sc.nextInt();

int area=a*b;
System.out.println("Area  of Rectangle is= "+area);
int per=(2*a)+(2*b);
System.out.println("Perimeter of Rectangle is= "+per);


}
}