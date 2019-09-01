/*Write a program for jagged 2d Array?*/
import java.util.Scanner;
class JaggedArray
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		int a[][]=new int[4][];
		a[0]=new int[3];
		a[1]=new int[4];
		a[2]=new int[2];
		a[3]=new int[3];
		for (int i=0;i<=a.length-1;i++)
		{
			for (int j=0;j<=a[i].length-1 ;j++ )
			{
			System.out.println("Class "+i+" Student "+j);
			a[i][j]=s.nextInt();
			}
		}
		System.out.println("Entered Jagged array of student table are=");
		for (int i=0;i<=a.length-1 ;i++ )
		{
			for (int j=0;j<=a[i].length-1 ;j++ )
			{
			System.out.print(a[i][j]+"\t");
			}
		System.out.println();
		}
	}
}
