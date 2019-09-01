import java.util.Scanner;
class Divisor
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter any number");
int n=sc.nextInt();
int i=1,count=1;
while(i<=n/2)

{if(n%i==0)
count++;
i++;
}

System.out.println(n+" divisor are"+count+" times");

}
}