import java.util.Scanner;
class PrimeNumber
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter any number");
int n=sc.nextInt();
int i=1,count=1;
while(i<=n/2)

{if(n%i==0)
count++;
	if(count>2)
	break;

i++;
}
if(count==2)
{
System.out.println(n+"is prime number");
}
else{
System.out.println(n+"is not prime number");
}
}
}