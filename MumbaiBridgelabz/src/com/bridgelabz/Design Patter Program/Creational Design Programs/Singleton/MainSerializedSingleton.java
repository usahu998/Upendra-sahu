package com.bridgelabz.designPatternProgram.CreationalDesignPattern.Singletonlink;

public class MainSerializedSingleton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//SerializedSingleton ss=new SerializedSingleton();
		
		SerializedSingleton ss=SerializedSingleton.getInstance();
		System.out.println(ss.hashCode());
		SerializedSingleton ss1=SerializedSingleton.getInstance();
		System.out.println(ss1.hashCode());
		
	}

}
