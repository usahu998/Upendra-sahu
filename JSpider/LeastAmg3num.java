import java.util.Scanner;
class LeastAmg3num
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter three number=");
int a=sc.nextInt();
int b=sc.nextInt();
int c=sc.nextInt();
int min=((a<b && a<c)?a:(b<c)?b:c);
System.out.println(min+" is least among three number"); 

}

}