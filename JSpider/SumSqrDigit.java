import java.util.Scanner;

class SumSqrDigit
{
public static void main(String args[])
{
Scanner sc= new Scanner(System.in);

System.out.println("Enter any number=");
int n=sc.nextInt();
int rev=0;
int digit=0;
do
{
digit=n%10;
n=n/10;
rev=rev+digit*digit;
}while(n!=0);

System.out.println(" Sum of Square of digit="+rev);
}
}