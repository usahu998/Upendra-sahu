package FunctionProgramming;

import java.util.Random;
import java.util.Scanner;

public class Pro8_CoupenNumber 
{
	
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of coupon");
		int n=sc.nextInt();
		
		generateCoupon(n);

	}
	
	static void generateCoupon(int nRandom) 
	{
		int ar[]=new int[nRandom];
		ar[0]=(int)(Math.random()*nRandom*10);
		int index=1;
		
		while(index<nRandom)
		{
			int rno=(int)(Math.random()*nRandom*10);
			boolean flag=true;
			for (int i = 0; i <index; i++)
			{
				if(ar[i]==rno)
				{
					flag=false;
					break;
				}
				
			}
			if(flag)
				ar[index++]=rno;
		}
		System.out.println("coupen number");
		for (int i = 0; i <index; i++)
		{
			System.out.println(ar[i]);
			
		}
	}


}
