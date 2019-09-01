/*Write a program in java for 3 Dimensonal Array? */
import java.util.Scanner;

class Array3d  
{
	public static void main(String[] args) 
	{
	 Scanner s=new Scanner(System.in);
	int a[][][]=new int[3][3][4];
		for (int i=0;i<=a.length-1 ;i++ )
		{
			for (int j=0;j<=a[i].length-1 ;j++ )
		    {
			   for (int k=0;k<=a[i][j].length-1 ;k++ )
			   {
				System.out.println("Enter School "+i+" Class "+j+" Student "+k);
				a[i][j][k]=s.nextInt();
               }
			}
		}
System.out.println("Entered Array Content are=");
       for (int i=0;i<=a.length-1 ;i++ )
       {
          System.out.println("SCHOOL"+i+"\t");
            for (int j=0;j<=a[i].length-1 ;j++ )
            {
               for (int k=0;k<=a[i][j].length-1 ;k++ )
               {
                  System.out.print("\t"+a[i][j][k]);
               }
            System.out.println();
            }
        System.out.println();
       }
	}  //closing of main method
   //closing of class
