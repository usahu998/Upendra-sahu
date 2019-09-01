import java.util.Scanner;
class SumOFEvenOdd
{
public static void main(String args[] )
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter any number=");
int n=sc.nextInt();
int count1=0,count2=0;
int i=1;
while(i<=n)
{
if(i%2==0)
{
count1=count1+i;
}
else
{
count2=count2+i;
}
i++;
}
System.out.println("Sum of Odd is "+count2);
System.out.println("Sum of Even is "+count1);
}
}