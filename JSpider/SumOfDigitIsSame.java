import java.util.Scanner;
class SumOfDigitIsSame
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter any two number");
int n=sc.nextInt();
int m=sc.nextInt();
int rev1=0,rev2=0;
int digit1=0,digit2=0;
do
{
digit1=n%10;
n=n/10;
rev1=rev1+digit1;


digit2=m%10;
m=m/10;
rev2=rev2+digit2;


}while(n!=0 || m!=0);
if(rev1==rev2)
{
System.out.println("Sum of Digit of Two integer are equal");
}
else
{
System.out.println("Sum of Digit of Two integer are Not equal");
}
}
}
