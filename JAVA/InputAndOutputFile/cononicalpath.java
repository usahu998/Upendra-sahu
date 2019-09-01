package InputAndOutputFile;

import java.io.File;

public class cononicalpath {

	
	public static void main(String[] args) {
		try{
			String path="D:\\files";
			File f=new File(path);
			
			File files[]=f.listFiles();
			
			for (int i = 0; i <= files.length-1; i++) 
			{
				System.out.println(files[i].getCanonicalPath());
				
			}
		}catch (Exception e) 
		{
			e.printStackTrace();
		}

	}

}
