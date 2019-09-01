package FRACTION;
import java.util.*;

public class CATMOUSE {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of querys");
		int n=sc.nextInt();
		 int a[]=new int[n+1];
		 int b[]=new int[n+1];
		 int sum1=0;
		 int sum2=0;
		 
		 System.out.println("Enter first querys");
		 for (int i = 0; i <= a.length-1;i++) 
		 {
			 a[i]=sc.nextInt();
			
		}
		 System.out.println("Enter 2nd querys");
		 
		 for (int j = 0; j <= b.length-1; j++) 
		 {
			
				 b[j]=sc.nextInt();
			
			
		}
		 
		 for (int i = 0; i <= a.length-1; i++) 
		 {
			 sum1=sum1+a[i];
			
		}
		 for (int i = 0; i <= b.length-1; i++) 
		 {
			 sum2=sum2+b[i];
			
		}
		 
		 if(sum1>sum2)
		 {
			 System.out.println("CAT A");
		 }
		 else if(sum2<sum1)
		 {
			 System.out.println("CAT B");
		 }
		 else
		 {
			 System.out.println("MOUSE C ");
		 }
		 

	}

}
