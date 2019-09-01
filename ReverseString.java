import java.util.Scanner;

class ReverseString
{
	public static void main(String args[])
	{
	Scanner s=new Scanner(System.in);
 	String original,reverse="";
	int i,length;
	System.out.println("Enter Any String=");
	original=s.nextLine();

	length=original.length();
	 for(i=length-1;i>=0;i--)
	  {
	reverse=reverse+original.charAt(i);
	  }
	System.out.println(reverse);

	}

}