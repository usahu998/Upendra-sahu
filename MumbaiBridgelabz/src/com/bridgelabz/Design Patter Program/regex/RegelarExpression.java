package com.bridgelabz.designPatternProgram.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegelarExpression {
	public static void main(String[] args) {
	
		Pattern p=Pattern.compile("Upen");
		Matcher m=p.matcher("Upendra sahu");
		
		while(m.find())
		{
			System.out.println("The word is present in "+ m.start()+"  "+m.end()+ "  "+ m.group()   );
		}
		
	

}
}