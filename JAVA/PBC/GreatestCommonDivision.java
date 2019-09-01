package PBC;

public class GreatestCommonDivision 
{
	public void gcd(int m,int n)
	{
		while(n!=0)
		{
			int rem=m%n;
			m=n;
			n=rem;
		}
		int gcd=m;
		System.out.println("The greatest common division is "+gcd);
	}

}
