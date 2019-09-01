package InputAndOutputFile;

import java.io.FileReader;
import java.io.FileWriter;


public class LaunchfiboInWritePrime {

	
	public static void main(String[] args) 
	{
			try
			{
				
				int temp;
				char num;
				int count=0;
				
				String path1="D:\\files\\Fibonacciseries.txt";
				String path2="D:\\files\\fiboPrime.txt";
				
				FileReader fr=new FileReader(path1);
				FileWriter fw=new FileWriter(path2);
				int a[]=new int[100];
				for (int i = 0; i <= a.length-1; i++) 
				{
				while((temp=fr.read())!=-1)
				{
					System.out.print((char)temp);
					a[i]=((char)temp);
				}
				}
				for (int i = 0; i <= a.length-1; i++) 
				{
					//System.out.print(a[i]);
					
				}
				/*	num=((char)temp);
				String str3=String.valueOf(num);
				String a[]=str3.split(" ");
				for (int i =a.length-1; i >=0; i--) 
				{
					System.out.print(a[i]+" ");*/
					
				
				//System.out.print(str3);
					
					//	System.out.print(((char)temp));
					//	String s[]=num.split(" ");
						
				
				/*		for(char i=1;i<=num;i++)
						   {
						    if(num%i==0) 
						     {
						       count++;
						     }
						   }
						   if(count==2)
						    {
						     System.out.println(num+"= is prime number ");
						    }
						    else
						    {
						     System.out.println(num+"= not a prime number"); 
						    }
						
					}*/
					
				
				fw.flush();
			}

				catch(Exception e)
			
			{
				e.printStackTrace();
			}
		}
}
