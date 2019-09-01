/*with argument and returns*/
import java.util.*;
class demo
{
	int add(int x,int y)
	{
		int z=x+y;
		return z;
	}
}



class javamethod4 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		int a,b;
		System.out.println("Enter to number=");
		a=s.nextInt();
		b=s.nextInt();

		demo d=new demo();
		int res=d.add(a,b);
		System.out.println("Addition is="+res);

		
	}
}
