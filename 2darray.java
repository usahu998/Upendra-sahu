import java.util.Scanner;

class array2d 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		int a[][]=new int[3][4];
		System.out.println("Enter any number=");
		a[0][0]=s.nextInt();
		System.out.println("Enter any number=");
		a[0][1]=s.nextInt();
		System.out.println("Enter any number=");
		a[0][2]=s.nextInt();
		System.out.println("Enter any number=");
		a[0][3]=s.nextInt();
		System.out.println("Enter any number=");
		a[1][0]=s.nextInt();
		System.out.println("Enter any number=");
		a[1][1]=s.nextInt();
		System.out.println("Enter any number=");
		a[1][2]=s.nextInt();
		System.out.println("Enter any number=");
		a[1][3]=s.nextInt();
		System.out.println("Enter any number=");
		a[2][0]=s.nextInt();
		System.out.println("Enter any number=");
		a[2][1]=s.nextInt();
		System.out.println("Enter any number=");
		a[2][2]=s.nextInt();
		System.out.println("Enter any number=");
		a[2][3]=s.nextInt();

		System.out.println("Array content are:-");

		System.out.println(a[0][0]);
		System.out.println(a[0][1]);
		System.out.println(a[0][2]);
		System.out.println(a[0][3]);
		System.out.println(a[1][0]);
		System.out.println(a[1][1]);
		System.out.println(a[1][2]);
		System.out.println(a[1][3]);
		System.out.println(a[2][0]);
		System.out.println(a[2][1]);
		System.out.println(a[2][2]);
		System.out.println(a[2][3]);


	}
}
