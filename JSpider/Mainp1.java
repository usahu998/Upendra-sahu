import java.util.Scanner;
class Mainp1
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);

System.out.println("Enter the number");
int a=sc.nextInt();
int x=a/10;
int y=a%10;
int ans=(x+y)+(x*y);
if (a==ans)
{
System.out.println(a+"Special two digit number");
}
else
{
System.out.println(a+"is not special two digit number");
}
System.out.println("Thank you");
}
}