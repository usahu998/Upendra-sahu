class  MainPalindrome
{
	public static void main(String[] args) 
	{
		Palindrome p=new Palindrome();
		for(int i=1;i<=1000;i++)
		{
	    boolean ans=p.ispalindrome(i);
		if(ans==true)
			System.out.println(i);
		}
	}
}

class Palindrome
{
	boolean ispalindrome(int n)
	{
	int t=n;
    int rev=0;

     do
      {

       int r=n%10;

rev=rev*10+r;
n=n/10;
}while(n!=0);
if(rev==t)
{
return true;
}
else
{
return false;
}
	
	}
}