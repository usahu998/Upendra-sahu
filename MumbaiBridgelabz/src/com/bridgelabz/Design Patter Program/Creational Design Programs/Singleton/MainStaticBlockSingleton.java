package com.bridgelabz.designPatternProgram.CreationalDesignPattern.Singletonlink;

public class MainStaticBlockSingleton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticBlockSingleton s = StaticBlockSingleton.getInstance();
		StaticBlockSingleton s1 = StaticBlockSingleton.getInstance();
		System.out.println(s.hashCode());
		System.out.println(s1.hashCode());
	}
}
