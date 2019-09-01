class stringinbuild 
{
	public static void main(String[] args) 
	{
		String s=new String("RajaRamMohanRoy");
		String s1=new String("vishal");
		System.out.println(s);                         /*RajaRamMohanRoy*/
		System.out.println(s.toUpperCase());           /*RAJARAMMOHANROY*/
		System.out.println(s.toLowerCase());           /*rajarammohanroy*/
	//	System.out.println(s.contains("Moha"));        /*true*/
	//	System.out.println(s.contains("java"));        /*false*/
		System.out.println(s.charAt(4));               /*R*/
		System.out.println(s.substring(7));            /*MohanRoy*/
		System.out.println(s.substring(0,0));          /*Ram*/
		//swapping
		s=s+s1;
		s1=s.substring(0,s.length()-s1.length());
		s=s.substring(s1.length());
        System.out.println(s);
		System.out.println(s1);


	}
}
