package FRACTION;
public class Cat_Mouse 
{
 public String catAndMouse(int x, int y, int z)
	{
		int a = Math.abs(x-z);
		int b = Math.abs(y-z);
		if(a > b)
		{
			return " Cat B " ;
		}
		else if(a < b)
		{
			return " Cat A ";
		}
		else
		{
			return " Mouse C ";
		}
	}
}
