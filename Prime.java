import java.util.Scanner;

class Prime
{
 public static void main(String args[])
 {
  int n,i,count=0;
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter any number=");
  n=sc.nextInt();
  for(i=1;i<=n;i++)
   {
    if(n%i==0) 
     {
       count++;
     }
   }
   if(count==2)
    {
     System.out.println(n+"= is prime number ");
    }
    else
    {
     System.out.println(n+"= not a prime number"); 
    }
 }
}