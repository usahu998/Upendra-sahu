import java.util.Scanner;
class SquareRectangle
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter square side");
		int a=sc.nextInt();
		System.out.println("Enter length & breadth");
		int b=sc.nextInt();
		int c=sc.nextInt();

		shape s=new shape();
		s.square(a);
		s.rectangle(b,c);

	}
}

class shape
{
	void square(double x)
	{
	double area=x*x;
	double per=4*x;
	System.out.println("Area of square is ="+area);
	System.out.println("perimeter of square is ="+per);
	}
	void rectangle(double a, double b)
	{
	double area=a*b;
	System.out.println("Area of rectangle is ="+area);
	double per=2*(a+b);
	System.out.println("perimeter of rectangle is ="+per);
	}
}
