/* wap to compare string using constant pool to non constant pool */
class  string2
{
	public static void main(String[] args) 
	{
		String s1="hello friends";
		String s2="hello friends";
		if(s1.equals(s2))
		{
		System.out.println("String are equal");	
		}
		else
		{
		System.out.println("String are not equal");
		}
	}
}
