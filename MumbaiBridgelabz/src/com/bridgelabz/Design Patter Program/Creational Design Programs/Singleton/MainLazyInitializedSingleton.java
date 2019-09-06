package com.bridgelabz.designPatternProgram.CreationalDesignPattern.Singletonlink;

public class MainLazyInitializedSingleton {

	public static void main(String[] args) {
		LazyInitializedSingleton lis=LazyInitializedSingleton.getInstance();
System.out.println(lis.hashCode());
LazyInitializedSingleton lis2=LazyInitializedSingleton.getInstance();
System.out.println(lis2.hashCode());
	}

}
