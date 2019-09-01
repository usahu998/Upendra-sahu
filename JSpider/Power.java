class Power 
{
	static int pow(int n,int p)
	{
		int pw=1;
		while(p>0)
		{
			pw=pw*n;
			p--;

		}
	return pw;
	}

	public static void main(String[] args) 
	{
		int p1=pow(5,4);
		System.out.println(p1);
		System.out.println(pow(2,4));
		System.out.println(pow(0,4));
		System.out.println(pow(4,0));
	}
}

