import java.util.Scanner;
class Reverse
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);

System.out.println("Enter number ");
int n=sc.nextInt();
int t=n;
int rev=0;

do
{

int r=n%10;

rev=rev*10+r;
n=n/10;
}while(n!=0);
System.out.println("Reverse number is ="+rev);
}
}