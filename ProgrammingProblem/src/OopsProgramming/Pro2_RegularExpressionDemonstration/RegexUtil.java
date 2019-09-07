package com.bridgelabz.oops_program;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexUtil 
{
	public static String name(String name)
	{
		Pattern p=Pattern.compile("[A-Za-z]+");
		Matcher m=p.matcher(name);
		if (m.find()&&m.group().equals(name))
			System.out.println("Valid name");
		else
			System.out.println("Invalid Name");
			return name;
	}

	public static String fullName(String fullName)
	{
		Pattern p=Pattern.compile("[A-Za-z]+([\\s][A-Za-z]+)+");
		Matcher m=p.matcher(fullName);
		if (m.find()&&m.group().equals(fullName))
			System.out.println("Valid fullname");
		else
			System.out.println("Invalid fullname");
			return fullName;
	}
	
	public static String mobileNumber(String mobileNumber)
	{
		Pattern p=Pattern.compile("(91)?[7-9][0-9]{9}");
		Matcher m=p.matcher(mobileNumber);
		if (m.find()&&m.group().equals(mobileNumber))
			System.out.println("Valid Mobile number");
		else
			System.out.println("Invalid Mobile number");
		return mobileNumber;
	}
	
	public static String date(String date)
	{
		Pattern p=Pattern.compile("([0-2][0-9]|[3][1-2])[/]([0][1-9]|[1][1-2])[/][0-9]{4}");
		Matcher m=p.matcher(date);
		if (m.find()&&m.group().equals(date))
			System.out.println("Valid date");
		else
			System.out.println("Invalid date");
			return date;
	}
	
}
