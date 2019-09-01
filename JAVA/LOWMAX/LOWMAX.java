package LOWMAX;

public class LOWMAX
{
	public void lowmax(int a[],int n)
	{
		
		int item,j;
		int min=0;
		int max=0;
		for (int i = 1; i <=n-1; i++) 
		{
			item=a[i];
			j=i-1;
			while(j>=0 && a[j]>item)
			{
				a[j+1]=a[j];
				j--;
			}
			
			a[j+1]=item;
		}
		min=(a[0]+a[1]+a[2]+a[3]);
		System.out.print(min+"  ");
		max=(a[1]+a[2]+a[3]+a[4]);
		System.out.println(max);
		
	}

}
