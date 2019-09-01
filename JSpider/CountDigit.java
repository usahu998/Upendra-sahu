import java.util.Scanner;
class CountDigit
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);

System.out.println("Enter number ");
int n=sc.nextInt();
int sum=0,count=0;
do
{
count++;
//int r=n%10;
//sum=sum+r;
n=n/10;
}while(n!=0);
System.out.println("count of Digit "+count);

}
}