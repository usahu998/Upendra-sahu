import java.util.*;
class index
{
	boolean compare(String z)
	{char ch[]=z.toCharArray();
	for (int i=0;i<=ch.length();i++ )
	{
		if (ch[i].equals("s"))
		{
			return true;
		}
		else 
		{
			return false;
        }
	 }
    }
}

class chararray 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		String s1;
		System.out.println("Enter any String ");
		s1=sc.nextLine();
		index o=new index();
		boolean res=o.compare(s1);

		if (res==true)
		{
			System.out.println("Chracter array are contain s ");
		}
			else
		    {
			System.out.println("Chracter array are  not contain s ");
			}
	}
}
