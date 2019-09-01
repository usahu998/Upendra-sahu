import java.util.Scanner;
class Table
{
public static void main(String args[])
{
Scanner sc= new Scanner(System.in);
System.out.println("Enter any number=");
int n=sc.nextInt();
int t=1;
for(int i=1;i<=10;i++)
{
t=n*i;
System.out.println(n+" * "+i+" = "+t);
}

}
}