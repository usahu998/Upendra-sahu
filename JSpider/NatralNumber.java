import java.util.Scanner;
class NatralNumber
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter any number");
int n=sc.nextInt();
int i=1,sum=0;
while(i<=n)
{
sum=sum+i;
i++;
}
System.out.println("Sum of first"+n+"number is"+sum);

}
}