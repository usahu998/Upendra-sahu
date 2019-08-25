package Arithmathicprogression;

public class AP {
	public void ap(int a,int b,int c)
	{int sum=0;
		System.out.println("the Arithmathicprogression series is");
		for (int i = c; i <=a+1; i=i+b)
		{
			System.out.print(i+" ");
			sum=sum+i;
		}
		System.out.println();
		System.out.print("The sum of the series is ="+sum);
	}
	

}
