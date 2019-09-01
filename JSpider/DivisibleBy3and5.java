import java.util.Scanner;
class DivisibleBy5and7
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter any number");
int n=sc.nextInt();
int count=0;
int i=1;
while(i<=n)
if(n%5==0 && n%7==0)
{
count++;
i++;
}
System.out.println(count+" is divisible by 5 and 7");

}
}