import java.util.Scanner;

class Arithmatic
{
public static void main(String args[])
{
Scanner sc=new Scanner (System.in);

System.out.println("Enter first value");
int a=sc.nextInt();
System.out.println("Enter Second value");
int b=sc.nextInt();

System.out.println("Enter addition is value="+ (a+b));
System.out.println("Enter multiplication value is=" +(a*b));
System.out.println("Enter divide value is=" +(a/b));
System.out.println("Enter sub  value is=" +(a-b));
System.out.println("Enter reminder  value is=" +(a%b));


}
}