class pattern
{
   
	public static void  main(String args[])
	{
	   int i,j,n=100,sum=0;
	   for(i=1;i<=4;i++)
	    {
	     for(j=1;j<=i;j++)
	      {
	       sum=sum+n;
	         if(i==1 && j==1)
                 {
                   System.out.print(sum);
                 }
                 else
	              {
                   if(j!=i)
                    {
	             System.out.print(sum+"*");
	             
                    }
                   else
                    {
	             System.out.print(sum);
		    
                    }  
                 }
           }
                      System.out.println();
		      }
}}	

	
