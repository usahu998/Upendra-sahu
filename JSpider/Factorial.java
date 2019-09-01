import java.util.Scanner;
class Factorial
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter any number");
int n=sc.nextInt();
int i=1,f=1;
while(i<=n)
{
f=f*i;
i++;
}
System.out.println(n+"!="+f);

}
}