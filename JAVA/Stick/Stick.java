package Stick;

public class Stick 
{
	public void Stick(int a[],int b[])
	{
		
		for (int i = 0; i <= a.length-1; i++) 
		{
			for (int j = i+1; j <= a.length-1; j++) 
			{
				if(a[i]>a[j])
				{
					a[i]=a[i]^a[j];
					a[j]=a[i]^a[j];
					a[i]=a[i]^a[j];
				}
			}
		}
		
		for (int i = 0; i <= a.length-1; i++) 
		{
			if(b[i]==a[0])
			{
				System.out.print("");
			}
			else
			{
				System.out.print(b[i]-1+" ");
			}
		}
	}
}
