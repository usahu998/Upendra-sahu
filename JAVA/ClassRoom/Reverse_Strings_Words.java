package ClassRoom;
public class Reverse_Strings_Words 
{
	public void revString_Words(String str)
	{
		String revString = "";
		
		String eachword[] = str.split(" ");
		
		for(int i = 0; i <= eachword.length-1; i++)
		{
			String word = eachword[i];
			String revWord = " ";
			
			for(int j = word.length()-1; j >= 0; j--)
			{
				revWord  = revWord + word.charAt(j);
			}
			revString = revString + revWord + "";
		}
		System.out.println(revString);
	}
}
