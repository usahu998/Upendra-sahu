class  Distance
{
	public static void main(String[] args) 
	{
		System.out.println("Enter th e point X");
int x=Integer.parseInt(args[0]);
System.out.println("Enter th e point Y");
int y=Integer.parseInt(args[1]);

double m=Math.pow(x,x);
double n=Math.pow(y,y);

double d=Math.sqrt(m+n);

System.out.println("Euclidean Distance= "+d);

	}
}
