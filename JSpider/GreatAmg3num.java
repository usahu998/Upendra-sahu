import java.util.Scanner;
class GreatAmg3num
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter any three number");
int a=sc.nextInt();
int b=sc.nextInt();
int c=sc.nextInt();

int x=(a>b && a>c)?a:(b>c)?b:c;
System.out.println(x+" is greater");


}


}