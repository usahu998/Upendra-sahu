import java.util.Scanner;
class Disarium 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number ");
		int n=sc.nextInt();
		int t=n;

		int digit=0,rev=0,sum=0,count=0,pw=1;

		do{
			digit=n%10;
			n=n/10;
			rev=rev*10+digit;
			count++;
		}while(n!=0);
			
		for (int i=count;i>=1;i--)
		{
			pw=digit*i;
			System.out.println(pw);
		}
		
		sum=sum+pw;
		System.out.println(sum);
	}
}
