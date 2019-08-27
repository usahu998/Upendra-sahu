package com.bridgelabz.algorithm;

import com.bridgelabz.utility.ScannerInput;

public class Pro16_BinarySwap {

	public static void main(String[] args)
	{
		System.out.println("Enter any number");
		int n=ScannerInput.intInput();
		if(n<=255)
		{
		String str=Integer.toBinaryString(n);
		System.out.println(str);
	//	int d=Integer.parseInt(str);
		char ch[]=str.toCharArray();
		char a[]=new char[8];
		
		for (int i = 0; i < a.length; i++) 
		{
			a[i]='0';
		}
		
		int b=a.length-ch.length;
		for (int i = 0; i < a.length; i++) 
		{
			if(i<ch.length)
					a[b+i]=ch[i];
		}
		
		for (int i = 0; i < a.length; i++)
		{
			System.out.print(a[i]);
		}
		
		System.out.println();
		String nibble1="";
		String nibble2="";
		//separating nibble
		for (int i = 0; i < a.length; i++)
		{
			if(i<4)
			nibble1=nibble1+a[i];
			else
				nibble2=nibble2+a[i];
		}
		System.out.println("First  nibble"+nibble1);
		System.out.println("Second nibble "+nibble2);
		
		String swap;
		swap=nibble2+nibble1;     //comcatinating both nibble
		System.out.println("Swapping From First Nibble to Second Nibble");
		System.out.println(swap);
		int bin=Integer.parseInt(swap);
		
		
		    int digit=0;
		    int rev=0;
		    int p=0;
		    int sum=0;
		    while(bin!=0)
		    {
		    	digit=bin%10;
		    	rev=digit*(int)Math.pow(2,p);
		    	if(rev!=0)
		    	{sum=sum+rev;
		    		if(p==1)
		    			System.out.print(rev);
		    	else
		    			System.out.print("+"+rev);
		    	}
		    	
		    	bin=bin/10;
		    	p++;
		    }
		    
		    System.out.print(" = "+sum);
		
		
		
		}
	}
}
