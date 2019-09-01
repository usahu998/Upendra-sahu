import java.util.Scanner;

class Fibonacci
{
	public static void main(String args[])
	{
	 Scanner s=new Scanner(System.in);
	 int a=0,b=1,i,temp,n;                                       /*Integer type variable*/
	 System.out.println("Enter Any number for fibonacci series=");  /* input any intiger value */
	 n=s.nextInt();
         System.out.println("Fibonacci series of " +n+" terms");
	 for(i=1;i<=n;i++)                                              /*for loop */
	  {
            System.out.print(+a+"+");                                /*printing series of Fibonacci */
	    temp=a+b;
	    a=b;
            b=temp;
	   
	  }
	}	
}