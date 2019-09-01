import java.util.Scanner;
import java.util.Random;
class GuessGame
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the Guess number between 0 to 9");
int n=sc.nextInt();

Random rd = new Random();
int ans=rd.nextInt(10);

if(n==ans)
{
System.out.println("Guess number is correct");
}
else 
{
System.out.println("Guess the incorrect it was "+ans);
}

}

}