import java.util.Scanner;
class ReverseMethod 
{
	public static void main(String[] args) 
	{ 
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number=");
		int n=sc.nextInt();
		Reverse re=new Reverse();
		int ans=re.disp(n);
		System.out.println("Reverse number is "+ans);
		
	}
}

class Reverse
{
	int disp(int x)
	{
		int rev=0;

do
{

int r=x%10;

rev=rev*10+r;
x=x/10;
}while(x!=0);
		return rev;
	}
}