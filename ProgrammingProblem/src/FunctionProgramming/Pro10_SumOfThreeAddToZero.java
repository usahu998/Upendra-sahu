package FunctionProgramming;

import java.util.Scanner;

public class Pro10_SumOfThreeAddToZero {

		public static void main(String[] args)
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter Element length");
			int n=sc.nextInt();
			int a[]=new int[n];
			
			System.out.println("Enter the "+n+" element");
			for (int i = 0; i < a.length; i++)
			{
				a[i]=sc.nextInt();
			}
			isThreeSumZero(a);

		}
		
		static void isThreeSumZero(int a[])
		{	boolean res=true;
		int count=0;
			for (int i = 0; i < a.length-2; i++)
			{
				for (int j = i+1; j < a.length-1; j++) 
				{
					for (int k =j+1; k < a.length; k++) 
					{
						if(a[i]+a[j]+a[k]==0)
						{
							System.out.println(a[i]+" "+a[j]+" "+a[k]);
							res= true;
							count++;
						}
					}
					
				}
				
			}
			System.out.println("the no. of such distinct triplepairs are="+count);
			if(res==false)
			{
				System.out.println(" Not Exist ");
			}
		}

}


