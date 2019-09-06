package com.bridgelabz.designPatternProgram.CreationalDesignPattern.Singletonlink;

public class MainEnumSingleton {

	public static void main(String[] args) 
	{
		EnumSingleton es=EnumSingleton.INSTANCE;
		System.out.println(es.hashCode());
		EnumSingleton es1=EnumSingleton.INSTANCE;
		System.out.println(es1.hashCode());

	}

}
