import java.util.Scanner;
class Multiple10
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter any number=");
int n=sc.nextInt();
String Str=(n%10==0)?"Multiple":"Not Multiple";
System.out.println(n+" is "+Str+" by 10");




}
}