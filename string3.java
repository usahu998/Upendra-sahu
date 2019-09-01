/* wap to string compare using constant pool  and non constant pool*/
class  string3
{
	public static void main(String[] args) 
	{
		String s1="hello world";
		String s2=new String("hello world");
		if (s1==s2)
		{
		System.out.println("address are equal");
		}
		else
		{
		System.out.println("adderss are not equal ");
		}
	}
}
