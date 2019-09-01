package InputAndOutputFile;

import java.io.File;
import java.nio.file.Files;


public class FUNCTION {

	public static void main(String[] args) 
	{
		try
		{
			
		
		String path="D:\\files\\new.txt";
		File f=new File(path);
		
		System.out.println(f.exists());
		System.out.println(f.isFile());
		System.out.println(f.isDirectory());
		System.out.println(f.canRead());
		System.out.println(f.canWrite());
		System.out.println(f.canExecute());
		System.out.println(f.lastModified());
		System.out.println(f.length());
		System.out.println(Files.probeContentType(f.toPath()));
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		

	}

}
