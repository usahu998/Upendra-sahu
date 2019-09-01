/*WRITE A PROGRAM TO PRINT FLOYDS TRANGLE PATTERN?*/
import java.util.Scanner;
class FloydsTriangle 
{
	public static void main(String[] args) 
	{int a=1;
	Scanner s=new Scanner(System.in);
	System.out.println("Enter any number");
	int n=s.nextInt();
    for (int i=1;i<=n ;i++ )              /*FOR ROW*/
    {
	for (int j=1;j<=i ;j++ )              /*FOR COLUMN*/
	{
	System.out.print(a+" ");
	a++;
	}System.out.println();
    }

	}
}
