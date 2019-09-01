import java.util.Scanner;

class DayInMonth 
{
	public static void main(String args[]) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Day number=");
		int d = sc.nextInt();

		if (d == 1 || d == 3 || d == 5 || d == 7 || d == 8 || d == 10 || d == 12) 
		{
			System.out.println(d + "=is have 31 days");
		} else if (d == 2) 
		{
			System.out.println(d + "=is have 28 days");
		} else if (d == 0 || d > 12) 
		{
			System.out.println(d + "=is invalid day number");
		} else 
		{
			System.out.println(d + "=is have 30 days");
		}
	}
}