/*Write a java program for jagged 3D Array? */
import java.util.Scanner;
class  jagged3darray
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
        int a[][][]=new int[3][][];
        a[0]=new int[2][];
		a[1]=new int[3][];
		a[2]=new int[4][];

		a[0][0]=new int[6];
		a[0][1]=new int[5];

		a[1][0]=new int[4];
		a[1][1]=new int[3];
		a[1][2]=new int[5];
		
		a[2][0]=new int[5];
		a[2][1]=new int[3];
		a[2][2]=new int[2];
		a[2][3]=new int[6];


		for (int i=0;i<=a.length-1 ;i++ )
		{
			for (int j=0;j<=a[i].length-1 ;j++)
			{
				for (int k=0;k<=a[i][j].length-1 ;k++ )
				{
					System.out.println("Enter bank "+i+ " branch "+j+" customer "+k);
					a[i][j][k]=s.nextInt();
				}
			}
		}
	System.out.println("Entered Jagged Array Are=");
		for (int i=0;i<=a.length-1 ;i++ )
		{System.out.println("\n");
			for (int j=0;j<=a[i].length-1 ;j++)
			{System.out.println();
				for (int k=0;k<=a[i][j].length-1 ;k++ )
				{
					System.out.print(a[i][j][k]+"\t");
				}
			}
	}
}
}
