import java.util.Scanner;
class divisiorMethod 
{
	public static void main(String[] args) 
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter any number=");
	int n=sc.nextInt();
	Div d=new Div();
	int ans=d.disp(n);
	System.out.println(ans+" is passed divisor number");
	

	}
}

class Div
{
	int disp(int x)
	{
		int count=0;
		int i=1;
		while(i<=x)
			{
			if(x%i==0)
			count++;
			i++;
			}
			return count;
		
	
	}
}