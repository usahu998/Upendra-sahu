import java.util.Scanner;
class Pnum
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter any number=");
		int a=sc.nextInt();
		PerfectNumber pn=new PerfectNumber();
		
		boolean ans=pn.perfect(a);
		if(ans==true)
		{
			System.out.println(ans+" is perfect number");
		}
		else
{
			System.out.println(ans+" is not perfect number");
		}

	}
}

class PerfectNumber 
{
	boolean perfect(int n)
	{
	int i=1,sum=0;
while(i<=n/2)
{
if(n%i==0)
sum=sum+i;
i++;
}
if(sum==n)
{
return true;
}
else
{
return false;
}
	
	}
}