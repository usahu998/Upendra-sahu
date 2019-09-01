import java.util.Scanner;
class StrongNumber
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter any number=");
int n=sc.nextInt();
int x=n;
int digit=0,rev=0,sum=0;
do{
int f=1;
digit=n%10;
n=n/10;
int i=1;
do{
f=f*i;
i++;
}while(i<=digit);

sum=sum+f;
}while(n!=0);
System.out.println(sum);
if(sum==x)
{
System.out.println(x+" = is strong number ");
}
else
{
System.out.println(x+" = is Not strong number ");
}

}
}