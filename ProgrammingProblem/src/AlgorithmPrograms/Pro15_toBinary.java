package AlgorithmPrograms;

import java.util.Scanner;

public class Pro15_toBinary {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number");
		int n=sc.nextInt();
		String bi=Integer.toBinaryString(n);
	    System.out.println(bi);
	   
	    int bin=Integer.parseInt(bi);
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
