package com.bridgelabz.oops_program;

import com.bridgelabz.utility.ScannerInput;

public class Pro2_RegexDemonstration 
{
	static String str="Hello <<name>> , We have your full name as <<fullName>> in our system. your contact number is 91-xxxxxxxxxx Please, let us know in case of any clarification Thank you BridgeLabz 01/01/2016.";
	public static void main(String[] args) 
	{
	System.out.println("Enter full name ");
	String fullName = ScannerInput.strInput();
	String regexFullname=RegexUtil.fullName(fullName);
	String[] name=fullName.split(" ");
	String regexName=RegexUtil.name(name[0]);
	System.out.println("Enter your mobile number");
	String mobileNumber=ScannerInput.strInput();
	String regexMobileNumber=RegexUtil.mobileNumber(mobileNumber);
	System.out.println("Enter date:");
	String date=ScannerInput.strInput();
	String regexDate=RegexUtil.date(date);
	
	String[] para=str.split("\\s");
	
	for (int i = 0; i < para.length; i++) 
	{
		if(para[i].equals("<<name>>"))
		{
			para[i]=regexName;
		}else if(para[i].equals("<<fullName>>"))
		{
			para[i]=regexFullname;
		}else if(para[i].equals("91-xxxxxxxxxx"))
		{
			para[i]=regexMobileNumber;
		}else if(para[i].equals("01/01/2016"))
		{
			para[i]=regexDate;
		}
	}
	
	for (int i = 0; i < para.length; i++) 
	{
		System.out.print(para[i]+" ");
	}
	
	
	}
}
