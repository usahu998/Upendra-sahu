import java.util.Scanner;
class count 
{
public static void main (String arg[])
{
int c=0;
String s1,ch;
Scanner sc= new Scanner(System.in);
System.out.println("Enter any string");
s1=sc.nextLine();
System.out.println("Enter any specific character to be count ");
ch=sc.nextLine();
for(int i=0;i<s1.length();i++)
{
if (s1.charAt(i)==ch.charAt(0))
{
c++;
}
}
System.out.println("Total number of "+ch+"="+c);
}
}