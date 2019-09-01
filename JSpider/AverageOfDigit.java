import java.util.Scanner;
class AverageOfDigit
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
rev=rev+digit;
count++;

}while(n!=0);

System.out.println(rev+"total digit");
System.out.println(count+"count digit");
System.out.println((rev/count)+" =Sum of Even digit in number");
}
}