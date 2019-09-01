import java.util.Scanner;
class FIZZ
{
public static void main(String args[])
{
Scanner sc= new Scanner(System.in);
System.out.println("Enter any number=");
int n=sc.nextInt();

for(int i=1;i<=n;i++)
{
if(i%3==0 &&i%5==0)
{
System.out.println("Fizz and Buzz");
}else if(i%3==0)
{System.out.println("Fizz");
}else if(i%5==0)
{System.out.println(" Buzz");
}
}

}
}