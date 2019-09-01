import java.util.Scanner;
class fact
{
void getdata(int n)
{
int f=1;
for(int i=1;i<=n;i++)
{
f=f*i;
}
System.out.print("factorial is="+f);
}
}
class facto
{
public static void main(String arg[])
{
int x;
Scanner sc=new Scanner(System.in);
System.out.println("Enter any number=");
x=Integer.parseInt(sc.nextLine());
fact obj= new fact();
obj.getdata(x);
}
}