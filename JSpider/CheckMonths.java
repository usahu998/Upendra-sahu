import java.util.Scanner;
class CheckMonths
{
	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter any number=");
	int n=sc.nextInt();
	String months=(n>0 && n<=12)?"Valid":"Not Valid";
	System.out.println(n+" is "+months+" months");

	}


}