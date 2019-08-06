package AlgorithmPrograms;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Arrays;
import java.util.Scanner;

public class Pro6_BinarySearcWordList 
{
	public static void main(String[] args)throws Exception 
	{ 
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter word you want to search");
		 String key=sc.nextLine();
		  File file = new File("D:\\BL\\List.txt"); 
		  
		  BufferedReader br = new BufferedReader(new FileReader(file)); 
		  String a[]=new String[100000];
		  String st; 
		  int k=1;
		  while ((st = br.readLine()) != null) 
			  a[k++]=st;
		//    System.out.println(st); 
		String str[]=new String[k];
		
		for (int i = 0; i <k; i++) 
		{
			str[i]=a[i];
		}
		System.out.println("After Reading from file");
		for (int i = 1; i < str.length; i++) 
		{
			System.out.println(str[i]+" ");
			
		}
		
		String add="";
		for (int i = 1; i <=str.length-1; i++) 
		{
			add=add+str[i];
		}
		String spl[]=add.split(",");
		Arrays.sort(spl);
		System.out.println("After Sorting String");
		for (int i = 0; i < spl.length; i++)
		{
			System.out.print(spl[i]+" ");
		}
		
		int ans=BinarySearchString(spl,key);
		System.out.println();
		if(ans<0)
			System.out.println("Word is not found");
		else
			System.out.println(key+" = Word is found");
		
	}
	
	static int BinarySearchString(String s[],String key)
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
	
}
