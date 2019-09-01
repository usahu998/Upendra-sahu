import java.util.Scanner;
class F2C
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);

System.out.println("Enter Fahrenheit ");
int f=sc.nextInt();
int c=(f-32)*5/9;
System.out.println(f+" Ferhanite to Celsius "+c);



}
}