import java.util.Scanner;
class Leapupto2019
{
public static void main(String asgs[])
{
int i=1;
while(i<=2019)
{
if(i%400==0 && i%100!=0 || i%4==0)
{
System.out.print(i+" ");
}
i++;
}


}
}