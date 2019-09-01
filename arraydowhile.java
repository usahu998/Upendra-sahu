import java.util.Scanner;

class arraydowhile
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int arr[]=new int[5];
int i=0;
do{
System.out.println("Enter any number=");
arr[i]=s.nextInt();
i++;
}while(i<=arr.length-1);

System.out.println("Array element are=");
i=0;
do{
System.out.println(arr[i]);
i++;
}while(i<=arr.length-1);
}
}