import java.util.Scanner;
class Range
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter Range");
int s=sc.nextInt();

for(int i=1;i<=s;i=i+i)
{


System.out.print(i+" ");
}

}
}