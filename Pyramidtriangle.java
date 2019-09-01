import java.util.Scanner;
public class Pyramidtriangle {

	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter any number=");
		int n=s.nextInt();
		int i,j;
		
		for (i=0;i<n; i++) 
		{
			System.out.println();
			for (j=n-i;j>1; j--) 
			{
				System.out.print(" ");
				
			}
			for(j=0;j<=i;j++)
			{
				System.out.print("* ");
			}
		}
		

	}

}
