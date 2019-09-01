import java.util.Scanner;
class SimpleInterest
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);

System.out.println("Enter Principal Amount");
int p=sc.nextInt();
System.out.println("Enter Rate %");
int r=sc.nextInt();
System.out.println("Enter Time in year");
int t=sc.nextInt();

int si=(p*r*t)/100;
System.out.println("Total Simple Interest is "+si);



}
}