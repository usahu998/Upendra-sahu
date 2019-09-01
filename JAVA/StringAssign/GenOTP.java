package StringAssign;

public class GenOTP 
{
	public void generateOTP(String a,String b)
	{
		System.out.println("The Generated OTP is ");
		System.out.print(a.charAt(0));
		System.out.print(a.charAt(1));
		System.out.print(b.charAt(0));
		System.out.print(b.substring(b.length()-1));
		
	}

}
