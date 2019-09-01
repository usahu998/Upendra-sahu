class Factorial
{
	
     public static void main(String arg[])
     {
     int f=1,i,n;
     n= Integer.parseInt(arg[0]);
         for(i=1;i<=n;i++)
         {
         f=i*f;
         }
         System.out.println("factorial is="+f);
     }
}