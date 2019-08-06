package AlgorithmPrograms;

import java.util.Arrays;

public class Utility
{
	static boolean isAnagram(String s1,String s2)
	{
		if(s1.length()!=s1.length())
		{
			return false;
		}
		else
		{
			char a1[]=s1.toLowerCase().toCharArray();
			char a2[]=s2.toLowerCase().toCharArray();
			Arrays.sort(a1);
			Arrays.sort(a2);
			
			if(Arrays.equals(a1, a2))
				return true;
		}
		return false;
	}
	
	
	static int[] isPrime()
	{
		int k=0;
		int a[]=new int[1000];
			int n = 0, sum = 0;
			while (++n <= 1000) 
			{
				int count = 1, i = 1;
				while (i <= n / 2) 
				{
					if (n % i == 0)
						count++;

					if (count > 2)
						break;
					i++;
				}
				
				if (count == 2) 
				{
				//	sum = sum + n;
					
					a[k++]=n;
				//System.out.print(n + " ");
				}
							
				
				
			}
			int c[]=new int[k];
			for (int j = 0; j < k; j++) 
			{
			c[j]=a[j];
			}	
			return c;
			//System.out.println();
			//System.out.println("Total number of prime number upto 1 - 100 is=" + sum);
	}
	
	
	static int isBinarySearch(int a[],int key,int low,int high)
	{
		int mid;
		while(low<=high)
		{
			mid=(low+high)/2;
			if(key==a[mid])
			{
				return mid;
			} 
			else if(key<=a[mid])
			{
				low=low;
				high=mid-1;
			}
			else if(key>=a[mid])
			{
				low=mid+1;
				high=high;
			}
			
		}
		return -1;
		
	}
	
	int BinarySearchString(String s[],String key)
	{
		int low=0;
		int high=s.length;
		int mid=0;
		while(low<=high)
		{
			mid=(low+high)/2;
			if(s[mid].compareTo(key)<0)
			{
				low=mid+1;
			}
			else if(s[mid].compareTo(key)>0)
			{
				high=mid-1;
			}
			else
			{
				return mid;
			}
		}
		return -1;
		
	}
	
	static void isInsertionSortString(String a[])
	{
		 
			System.out.println("before sorting");
			for (int i = 0; i < a.length; i++) 
			{
				System.out.print(a[i]+" ");
				
			}
			
			System.out.println();
			Arrays.sort(a);
			System.out.println("After sorting");
			for (int i = 0; i < a.length; i++) 
			{
				System.out.print(a[i]+" ");
				
			}

	}
	
	
	static void insertionSortInteger(int a[])
	{
		 for (int i = 1; i < a.length; i++)
		 {
			 int t=a[i];
			 int j=i-1;
			 while(j>=0 && a[j]>t)
			 {
				 a[j+1]=a[j];
				 j--;
			 }
			 a[j+1]=t;
			 
				
		}
		 System.out.println("After sorting");
		for (int i = 0; i < a.length; i++) 
		{
			System.out.print(a[i]+" ");
			
		}
		
	}

	static void bubbleSort(int a[])
	{
		System.out.println("Before sorting");
		for (int i = 0; i < a.length; i++) 
		{
			System.out.print(a[i]+" ");
		}
		
		System.out.println();
		for (int i = 0; i < a.length; i++) 
		{
			for (int j = 0; j < a.length-1-i; j++) 
			{
				if(a[j]>a[j+1])
				{
					a[j]=a[j]^a[j+1];
					a[j+1]=a[j]^a[j+1];
					a[j]=a[j]^a[j+1];
				}
			}
		}
		
		System.out.println("After sorting");
		for (int i = 0; i < a.length; i++) 
		{
			System.out.print(a[i]+" ");
		}
	}


	public void bubbleSortString(String[] a) 
	{
      String temp;
		
		for (int i = 0; i < a.length; i++) 
		{
			for (int j = i+1; j < a.length; j++) 
			{
				if(a[i].compareToIgnoreCase(a[j])>0)
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
				
			}
			
		}
		System.out.println("After Sorting");
		for (int i = 0; i < a.length; i++) 
		{
			System.out.print(a[i]+" ");
			
		}

	}
	
	static void isMonthlySalary(int p,double R,int y)
	{
	double n=12*y;
	double r=R/(12*100);
	double payment;
	
	payment=p*r/(1-Math.pow(1+r,-n));
	
	System.out.println("Monthly payment is = "+payment);
	}

}
