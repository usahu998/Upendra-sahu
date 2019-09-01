import java.util.Scanner;
class Swap
{
 public static void main(String args[])
 {
  Scanner sc=new Scanner (System.in);
  int a,b;
  System.out.println("Enter first number=");
  a=sc.nextInt();
  System.out.println("Enter second number=");
  b=sc.nextInt();
  a=a+b;
  b=a-b;
  a=a-b;

/*  second method
     a=a*b;
     b=a/b;
     a=a/b;
    third method
     a=a^b;
     b=a^b;
     a=a^b;
                         */ 

System.out.println("A="+a+"\nB="+b);

 }


}


