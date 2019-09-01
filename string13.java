/* WAP to using of compareTo()
            <0(String2 is greater) 
			=0(String is equal)
			>0(String1 is greater)
 */
class string13 
{
	public static void main(String[] args) 
	{
		String s1="Sachin";
		String s2="Sourav";
	if (s1.compareTo(s2)>0)
	{
		System.out.println("String1 is greater");
	}
	else if (s1.compareTo(s2)<0)
	{
		System.out.println("String2 is greater ");
	} 
	else
	{ 
		System.out.println("Strings are equalS!!");
	}
	}
}
