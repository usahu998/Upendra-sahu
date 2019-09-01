/* Intern() is used to bring a copy of string is present in non constant pool to constant pool as shown below */
class string14
{
	public static void main(String[] args) 
	{
	String s1=new String("KODNEST");
		System.out.println(s1);
String s2=s1.intern();
if (s1==s2)
{
System.out.println("Reference are equal");
}
else
{
System.out.println("Reference are unequal");
}
String s3=("KODNEST");
if (s2==s3)
{
System.out.println("Reference are equal");
}
else
{
System.out.println("Reference are unequal");
}

	}
}
