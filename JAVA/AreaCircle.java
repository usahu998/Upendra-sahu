class AreaCircle 
{
	public static void main(String[] args) 
	{
		double r1=6.7,r2=8.9,r3=3.6,r4=14;
		Circle c=new Circle();
		c.disp(r1);
		c.disp(r2);
		c.disp(r3);
		c.disp(r4);

	}
}
 class Circle
 {
	 void disp(double x)
	 {
		 System.out.println("Area of circle="+(3.14*x*x));
		 System.out.println("circumfrance of circle="+(2*3.14*x));
	 
	 }
 }