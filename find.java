class find  
{
	public static void main(String[] args) 
	{
		int a[]=new int[]{1,2,3,5,6,7};
		int n=a.length+1;
		int total=n*(n+1)/2;
		for (int i=0;i<=a.length-1;i++)
		{
			total=total-a[i];
		}
	System.out.println(total);
	}
}