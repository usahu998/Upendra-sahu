import java.util.Scanner;
class ProductDigit
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);

System.out.println("Enter number ");
int n=sc.nextInt();
int sum=1,p=1;
do
{

int r=n%10;
p=p*r;

//sum=sum*r;
n=n/10;
}while(n!=0);

System.out.println("Product of Digit "+p);
}
}