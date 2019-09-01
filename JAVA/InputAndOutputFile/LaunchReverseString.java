package InputAndOutputFile;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class LaunchReverseString {

	public static void main(String[] args) 
	{
		try
		{
			int temp;
			char num;
			
			
			//String a[]= str1.split(" ");
			String path1="D:\\files\\String.txt";
			String path2="D:\\files\\Reverse.txt";
			
			FileInputStream fr=new FileInputStream(path1);
			FileOutputStream fw=new FileOutputStream(path2);
			
			while((temp=fr.read())!=-1)
			{
				num=((char)temp);
				String str3=String.valueOf(num);
				String a[]=str3.split("  ");
				String b[]=new String[a.length];
				
				for (int i =0; i <=a.length-1; i++) 
				{
					System.out.print(a[i]);
		            b[i]=a[i];
				//	fw.write(temp);
				}
				
				
				
				}
			
			
			fw.flush();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

	}

}
