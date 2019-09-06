package com.bridgelabz.designPatternProgram.CreationalDesignPattern.Singletonlink;

public class Demo {
	
	private Demo () {
	
	}
	
	private static Demo demoInstance=new Demo();
	
	public static Demo getInstance()
	{
		return demoInstance;
	}

}
