import java.util.Scanner;
class Armstrong
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);

System.out.println("Enter number ");
int n=sc.nextInt();
int sum=0;
int t=n;
do
{

int r=n%10;


sum=sum+r*r*r;
n=n/10;
}while(n!=0);
if(sum==t)
{
System.out.println(t+"is armstrong");
}
else
{
System.out.println(t+"is not armstrong");
}
}
}