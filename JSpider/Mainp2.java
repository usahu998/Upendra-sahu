import java.util.Scanner;
class Mainp2
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);

System.out.println("Enter any number");
int a=sc.nextInt();

//if(n/2*2==n)
if(a%2==0)
{

System.out.println(a+"is Even number");
}
else
{
System.out.println(a+"is odd number");
}

}
}