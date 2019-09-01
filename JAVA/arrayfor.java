import java.util.Scanner;

class arrayfor
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int arr[]=new int[5];
for(int i=0;i<=arr.length-1;i++)
{
System.out.println("Enter any number=");
arr[i]=s.nextInt();
}
System.out.println("Array content are=");

for(int i=0;i<=arr.length-1;i++)
{
System.out.println(arr[i]);
}



}
} 