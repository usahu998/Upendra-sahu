package DataStructure;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Pro2_MainOrderedList 
{
	public static void main(String[] args) throws IOException 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number you want to search");
		int key=sc.nextInt();

		
		File file = new File("D:\\BL\\Num.txt"); 
		  
		  BufferedReader br = new BufferedReader(new FileReader(file)); 
		  String str="";
		  String add="";
		
		  while((str = br.readLine())!= null) 
		  {
			 add=add+str;
		  }
		  String a[]=add.split(" ");   //splitting String
		  int n[]=new int[a.length];
		  int count=0;
		  for (int i = 0; i < a.length-1; i++) 
		  {
			 n[i]=Integer.parseInt(a[i]); 
			count++;
		  }
		  int v=Integer.parseInt(a[count].trim());
			n[count]=v;
		Arrays.sort(n);
		Pro2_OrderedList<Integer> ol=new Pro2_OrderedList<Integer>();
		
		for (int i = 0; i < a.length; i++) 
		{
			ol.add(n[i]);
		}
		ol.display();
		boolean ans=isCheck(n,key);
		if(ans)
		{
			System.out.println("Number is already present");
		}
		else
		{
			System.out.println("Number is not present in list");
			System.out.println(key+" is added to this list");
			ol.add(key);
		}
		
		if(ol.search(ol.head,48))
			System.out.println("yes");
		else 
			System.out.println("no");
		ol.display();
		
		System.out.println("size of list is"+ol.size());
		System.out.println("List is empty :"+ol.isEmpty());
		ol.delete(2);
		System.out.println("delete the element from index 2");
		ol.display();

	}
	static boolean isCheck(int n[],int key)
	{
		for (int i = 0; i < n.length; i++) 
		{
			if(key==(n[i]))
				return true;
		}
		return false;
	}
}
