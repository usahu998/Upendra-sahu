import java.util.Scanner;

class Bio
{
public static void main(String args[])
{
Scanner sc=new Scanner (System.in);

System.out.println("What is your name");
String a=sc.nextLine();


System.out.println("Hello "+a+ " How old are you? ");
int b=sc.nextInt();
System.out.println(a+" your age was " +(b-5)+"year back ");
System.out.println("and your age will be "+(b+5) +" after five year");



}
}