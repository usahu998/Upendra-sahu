package com.bridgelabz.designPatternProgram.CreationalDesignPattern.Singletonlink;

public class MainEagerInitializedSingleton {

	public static void main(String[] args) {
		EagerInitializedSingleton e=EagerInitializedSingleton.getInstance();
		EagerInitializedSingleton e1=EagerInitializedSingleton.getInstance();
        System.out.println(e.hashCode());
        System.out.println(e1.hashCode());
	}

}
