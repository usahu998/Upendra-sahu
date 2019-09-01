import java.util.Scanner;
class Coin
{
public static void main(String arg[])
{

Scanner sc=new Scanner(System.in);

System.out.println("a");
int n=sc.nextInt();
int fc=n/5;
System.out.println(fc);
int tc=(n%5)/2;
System.out.println(tc);
int oc=(n%5)%2;
System.out.println(oc);
System.out.println("Total number of coins is "+(fc+oc+tc));
}}