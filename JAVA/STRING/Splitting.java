package STRING;

public class Splitting 
{
	public void revstring(String str)
	{
		String revString=" ";
		String eachword[]=str.split(" ");
		for (int i = 0; i <= eachword.length-1; i++) 
		{
			String word=eachword[i];
			String revword=" ";
			for (int j = word.length()-1; j >=0 ; j--) 
			{
				revword = revword + word.charAt(j);
				
			}
			revString=revString+revword+" ";
			
		}
		System.out.println(revString);
	}

}
