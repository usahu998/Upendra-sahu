package InputAndOutputFile;
//import java.io.FileReader;
//import java.io.FileWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
//import java.io.ObjectInput;

//import com.sun.org.apache.xalan.internal.xsltc.compiler.Template;
public class Launch 
{
	public static void main(String[] args) 
	{
		try
		{
			int temp;
			String str1;
			String path1="D:\\files\\Fibonacciseries.txt";
			String path2="D:\\files\\Generate.txt";
			
			FileInputStream fr=new FileInputStream(path1);
			FileOutputStream fw=new FileOutputStream(path2);
			
			while((temp=fr.read())!=-1)
			{
				//Integer obj = new Integer(temp);
			//	int val = obj.
			    //str1 = String.valueOf(temp);
			    		//Integer.toString(temp);
			    
				//System.out.println(val);
				//System.out.println(temp);
				fw.write(temp);
				
			}
			fw.flush();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
//import java.io.FileInputStream;
//import java.io.FileOutputStream;

