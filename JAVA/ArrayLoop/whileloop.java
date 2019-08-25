package ArrayLoop;

public class whileloop {

	
	public static void main(String[] args) 
	{
		int a[]=new int[5];
		int i=0;
		while(i<=a.length-1)
		{
			a[i]=i;
			System.out.print(i+" ");
			i++;
		}

	}

}
