/* without argument and returns*/
class demo
{
	int add()
	{
		int a=10,b=20,c;
		c=a+b;
		return c;
	}
}





class  javamethod3
{
	public static void main(String[] args) 
	{
		demo d= new demo();
		int res=d.add();
			System.out.println("addition is="+res);
	}
}