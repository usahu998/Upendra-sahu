
import java.util.Scanner;
class Prime1 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any  number");
		int n=sc.nextInt();
		isPrime p=new isPrime();
		boolean ans=p.disp(n);
		if(ans==true)
		{
			System.out.println(n+"is a prime number");
		}
		else
		{
			System.out.println(n+"is not a prime number");
		}

	}
}

class isPrime
{
	boolean disp(int n)
	{
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
return true;
}
else{
return false;
}
	
}
}