class LaunchPerfectNumber 
{
	public static void main(String[] args) 
	{int count=0;
		int i=1,sum=0;
while(i<=1000/2)
{
if(1000%i==0)
sum=sum+i;
count++;
i++;
}

System.out.println("ther are "+count+" perfect number in between 1 to 1000");
/*if(sum==n)
{
System.out.println(n+" Perfect Number");
}
else
{
System.out.println(n+" not Perfect Number");
}
*/
		
	}
}

