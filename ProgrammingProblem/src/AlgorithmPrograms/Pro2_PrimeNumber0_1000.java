package AlgorithmPrograms;

public class Pro2_PrimeNumber0_1000 
{
	public static void main(String[] args)
	{
		Utility u=new Utility();
		int c[]=u.isPrime();
		
		for (int i = 0; i < c.length; i++) 
		{
			System.out.print(c[i]+" ");
		}
	}
}
