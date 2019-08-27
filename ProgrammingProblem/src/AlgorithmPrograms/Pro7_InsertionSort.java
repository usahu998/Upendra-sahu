package com.bridgelabz.algorithm;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

import com.bridgelabz.utility.Utility;

public class Pro7_InsertionSort 
{
	@SuppressWarnings("resource")
	public static void main(String[] args)throws Exception 
	{ 
		 
		 
		  File file = new File("D:\\BL\\Num.txt"); 
		  
		  BufferedReader br = new BufferedReader(new FileReader(file)); 
		  String a[]=new String[100000];
		  String st; 
		  int k=1;
		  while ((st = br.readLine()) != null)
			  a[k++]=st;
		//    System.out.println(st); 
		String str[]=new String[k];
		
		for (int i = 1; i < k; i++) 
		{
			
			str[i-1]=a[i];
			
			
		}
		String z[]=new String[1000];
		int r=0;
		for (int i = 0; i < str.length-1; i++) 
		{
			z[r++]=str[i];
		}
		
		String x[]=new String[r];
		for (int i = 0; i <r; i++) 
		{
			x[i]=z[i];
		}
		String add="";
		for (int i = 0; i < x.length; i++) 
		{
			add=add+x[i];
			
		}
		
		String spl[]=add.split(" ");
		
		
		System.out.println();
		int ar[]=new int[spl.length];
		
		int co=0;
		
		for (int i = 0; i < ar.length-1; i++) 
		{
			//int n=Integer.parseInt(spl[i]);
			ar[i]=Integer.parseInt(spl[i]);
			co++;
		}
		int v=Integer.parseInt(spl[co].trim());
		ar[co]=v;
		
		
		Utility.insertionSortInteger(ar);
		
		
	}

}
