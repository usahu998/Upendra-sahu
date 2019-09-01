import java.util.Scanner;

class Average
{
 public static void main(String args[])
 {
  Scanner s= new Scanner(System.in);
  int a,b,c;
  
  System.out.println("Enter First Number=");
  a=s.nextInt();
  System.out.println("Enter Second Number=");
  b=s.nextInt();
  System.out.println("Enter Third Number=");
  c=s.nextInt();
  double avg= ((a+b+c)/3.0);
  System.out.println("The Average of 3.Number "+a+"+"+b+"+"+c+" is ="+avg);															
 }

}