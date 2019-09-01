/*with argument and no returns*/
import java.util.Scanner;
class demo
{
	void add(int x,int y)
	{	int z=x+y;
	System.out.println("additions is="+z);
	}
}

class javamethod2 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter two number=");
		int a=s.nextInt();
		int b=s.nextInt();
		demo d=new demo();
		d.add(a,b);

		

		
	}
}
