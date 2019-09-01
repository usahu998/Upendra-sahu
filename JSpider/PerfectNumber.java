import java.util.Scanner;
class PerfectNumber
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter any number");
int n=sc.nextInt();
int i=1,sum=0;
while(i<=n/2)
{
if(n%i==0)
sum=sum+i;
i++;
}
if(sum==n)
{
System.out.println(n+" Perfect Number");
}
else
{
System.out.println(n+" not Perfect Number");
}
}
}