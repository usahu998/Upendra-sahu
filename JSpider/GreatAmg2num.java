import java.util.Scanner;
class GreatAmg2num
{
	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter first number");
	int a=sc.nextInt();

	System.out.println("Enter first number");
	int b=sc.nextInt();
	int least=(a<b)?a:b;
	System.out.println(least + " =is least number");
	}
}