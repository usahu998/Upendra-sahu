import java.util.Scanner;
class SwitchEvenOdd
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number");
int n=sc.nextInt();
switch(n%2)
{
case 1:System.out.println(n+"is odd number ");
break;
case 0:System.out.println(n+"is even number ");
break;



}


}
}


/*

switch(n)
{
case 1;
case 3;
case 5;
case 7;
case 8;
case 10;
case 12; System.out.println("31 days")
break:
case 4;
case 6;
case 9;
case 11; System.out.println("30 days")
break:
case 2; System.out.println("28 & 29 days")
break:
default:
}

*/