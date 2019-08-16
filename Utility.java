package com.bridgelabz.utility;

import java.util.Arrays;
/*
 * @Author Upendra Sahu
 * 
 * */
public class Utility
{
	
	/* @Purpose check Anagram
	 * @para String s1
	 * @para String s2
	 * @return boolean
	 * */
	
	
	
	
	public static boolean isAnagram(String s1,String s2)
	{
		if(s1.length()!=s2.length())  //comparing length
		{
			return false;
		}
		else
		{
			char a1[]=s1.toLowerCase().toCharArray();  //String to character Array
			char a2[]=s2.toLowerCase().toCharArray();  //String to character Array
			Arrays.sort(a1);                            //Arrange in ascending order
			Arrays.sort(a2);							//Arrange in ascending order
			
			if(Arrays.equals(a1, a2))                 //check both array are equal or not
				return true;
		}
		return false;
	}
	
	/* @Purpose isPrime
	 * @para no
	 * @return int array
	 * */
	
	
	public static int[] isPrime()
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
			// storing in new array with new size
			int c[]=new int[k];
			for (int j = 0; j < k; j++) 
			{
			c[j]=a[j];
			}	
			return c;
			//System.out.println();
			//System.out.println("Total number of prime number upto 1 - 100 is=" + sum);
	}
	
	/* @Purpose isBinarySearch
	 * @para int array
	 * @para int key
	 * @para int low
	 * @para int high
	 * @return int
	 * */
	
	public static int isBinarySearch(int a[],int key,int low,int high)
	{
		int mid;
		while(low<=high)
		{
			mid=(low+high)/2;   // find mid value
			
			if(key==a[mid])
			{
				return mid;
			} 
			else if(key<=a[mid])  // key is less than mid
			{
				low=low;
				high=mid-1;
			}
			else if(key>=a[mid])   // key is greater than mid
			{
				low=mid+1;
				high=high;
			}
			
		}
		return -1;
		
	}
	
	
	/* @Purpose BinarySearchString
	 * @para String Array
	 * @para String key
	 * @return int
	 * */
	
	public int BinarySearchString(String s[],String key)
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
	
	

	/* @Purpose BinarySearchString
	 * @para String Array
	 * @para String key
	 * @return int
	 * */
	public static void isInsertionSortString(String a[])
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
	
	
	public static void insertionSortInteger(int a[])
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

	public static void bubbleSort(int a[])
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
	
	public static void isMonthlySalary(int p,double R,int y)
	{
	double n=12*y;
	double r=R/(12*100);
	double payment;
	
	payment=p*r/(1-Math.pow(1+r,-n));
	
	System.out.println("Monthly payment is = "+payment);
	}
	
	
	/* @Purpose isLeapYear
	 * @para int n  = year
	 * @return boolean
	 * */
	
	public static boolean isLeapYear(int n)
	{
		if(n>999 && n<=9999)
		{
			if(n%400==0 || n%4==0 && n%100!=0)   //formula
			{
				//System.out.println(n+" is a leap year ");
				return true;
			}
			else
			{
				//System.out.println(n+" is not a leap year");
				return false;
			}
		}
		else
		{
			//System.out.println("invalid year");
			return false;
		}

	}
	

	/* @Purpose find day
	 * @para int m0  = month
	 * @para int d0 = date
	 * @para int y0 = year
	 * @return int
	 * */
	
	public static int day(int m0,int d0,int y0 )
	{
		y0=y0-(14-m0)/12;
		int x=y0+y0/4-y0/100+y0/400;
		m0=m0+12*((14-m0)/12)-2;
		d0=(d0+x+31*m0/12)%7;
		return d0;
		
	}


	
	}


