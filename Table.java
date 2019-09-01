import java.util.Scanner;
class Table
{
public static void main(String arg[])
{

int a[]=new int[11];
Scanner s=new Scanner(System.in);
System.out.println("Enter Any Number=");
int n=s.nextInt();
for(int i=1;i<=10;i++)
{

System.out.println(n+"*"+i+"="+n*i);

}

System.out.println("Array Element are=");
for (int i = 1; i <=a.length-1; i++) 
{
	a[i]=n*i;
	System.out.print(a[i]+" ");
	
}
}
}
