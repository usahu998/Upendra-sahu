import java.util.Scanner;

class MainResult
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter four subject marks");
int n1=sc.nextInt();
int n2=sc.nextInt();
int n3=sc.nextInt();
int n4=sc.nextInt();
double sum=(n1+n2+n3+n4);
double per =sum/4.0;
if(n1<35||n1<35||n1<35||n1<35)
{
System.out.println("Fail");
}
else if(per>=85)
{
System.out.println("Distinction");
}
else if(per>=60)
{
System.out.println("1nd class");
}
else if(per>=50)
{
System.out.println("2nd class");
}
else
{
System.out.println("Passed");
}
}

}