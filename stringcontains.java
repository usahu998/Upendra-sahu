import java.util.Scanner;

class check
{
	boolean containing(String z)
	{
		if(z.contains("s")==true)
		{
			return true;
		}
		else
		{
			return false;
		     
		}
	}
}


class stringcontains 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		String s;
		System.out.println("Enter any string=");
		s=sc.nextLine();
		check o=new check();
		 boolean res=o.containing(s);

		 if(res==true)
		{
			 System.out.println("String is containing s");
		}
		else
		{
			System.out.println("String are not containing s");
		}



	}
}
