import java.util.Scanner;
class Terynary
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);

System.out.println("Enter Length");
int n=sc.nextInt();

String st=(n>=0)?"positive":"negative";

System.out.println(n+" is "+st+" number");



}
}