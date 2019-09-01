class  Pro10_EuclideanDistance 
{
public static void main(String args[])
{
System.out.println("Enter th e point X");
int x=Integer.parseInt(args[0]);
System.out.println("Enter th e point Y");
int y=Integer.parseInt(args[1]);

int m=(int) Math.pow(x,x);
int n=(int) Math.pow(y,y);

int d=(int) Math.sqrt(m+n);

System.out.println("Euclidean Distance= "+d);

}
}
