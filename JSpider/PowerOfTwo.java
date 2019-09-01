class PowerOfTwo
{	
	public static void main(String args[])
	{
	int n=Integer.parseInt(args[0]);
	if(0<=n && n<31)
	{
	int pow=1;
	for(int i=0;i<=n;i++)
	{
	
	System.out.println("2^"+i+"  "+pow);
	pow=2*pow;

	}
	int y=pow;
	if(y%400==0||y%4==0&&y%100!=0)
	{
	System.out.println(y+"= is a leap year ");
	}
	else
	{
	System.out.println(y+"=is not a leap year ");
	}



	}
	else
	{
	System.out.println("Invalid number ");
	}

	
	}

}