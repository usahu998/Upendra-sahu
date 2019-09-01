import java.util.Scanner;
class DivisorProduct
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter any number");
int n=sc.nextInt();
int pro=1;
int i=1;
while(i<=n)
{
int count=0;
int num=i;
while(num>=1)
{
if(i%num==0)
{
count=count++;
}

num--;
}
if (count==2)
{
pro=pro*i;
System.out.print(i+" ");
}
i++;
}

System.out.println(n+"product of  divisor is"+pro);

}
}