package com.bridgelabz.designPatternProgram.CreationalDesignPattern.Singletonlink;

public class MainDemo {
	
	public static void main(String[] args) {
		//Demo d=new Demo();  //Error the constructor demo is not visible
		
		 Demo d1=Demo.getInstance(); 
		 System.out.println(d1.hashCode());
		 // Demo.getInstance(); 
		 // Demo.getInstance();
		 
		 }
	
}
