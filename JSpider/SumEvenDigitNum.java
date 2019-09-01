import java.util.Scanner;
class SumEvenDigitNum
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter any number=");
int n=sc.nextInt();
int rev=0;
int digit=0;
int count=0;
do
{
digit=n%10;
n=n/10;
if(digit%2==0)
{
rev=rev+digit;
}
}while(n!=0);
System.out.println(rev+" =Sum of Even digit in number");
}
}