import java.util.Scanner;
class StrongNumberMain 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number=");
		int n=sc.nextInt();
		StrongNumber sn=new StrongNumber();
		boolean ans=sn.disp(n);
		if(ans==true)
		{
		System.out.println(n+" = is strong number ");
		}
		else
		{
		System.out.println(n+" = is Not strong number ");
		}
	}
}

class StrongNumber
{
	boolean disp(int n)
	{
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
return true;
}
else
{
return false;
}

	}
}