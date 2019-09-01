import java.util.Scanner;
class NatralNumberMethod 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		Natural na=new Natural();
		int ans=na.disp(n);
		System.out.println(n+"Sum of natural number is ="+ans);
	}
}
class Natural
{
	int sum=0;
	int disp(int x)
	{
	for (int i=1;i<=x ;i++ )
	{
		sum=sum+i;
	}
	return sum;
	}
}
