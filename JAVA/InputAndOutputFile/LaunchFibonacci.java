package InputAndOutputFile;
import java.io.FileWriter;
import java.util.Scanner;

public class LaunchFibonacci {
	public static void main(String[] args) 
	{
		try
		{
			 Scanner s=new Scanner(System.in);
			 int a=0,b=1,i,store,n;                                       /*Integer type variable*/
			 System.out.println("Enter Any number for fibonacci series=");  /* input any intiger value */
			 n=s.nextInt();
			 
			String path2="D:\\files\\Fibonacciseries.txt";
			
			FileWriter fw=new FileWriter(path2);
			
			 for(i=1;i<=n;i++)                                              /*for loop */
			  {
		            fw.write(a+" ");                                /*printing series of Fibonacci */
			    store=a+b;
			    a=b;
		            b=store;
			   
			  }
			fw.flush();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}


}
