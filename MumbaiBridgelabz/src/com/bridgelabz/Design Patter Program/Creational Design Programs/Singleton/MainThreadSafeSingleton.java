package com.bridgelabz.designPatternProgram.CreationalDesignPattern.Singletonlink;

public class MainThreadSafeSingleton {

	public static void main(String[] args) {
		ThreadSafeSingleton tss=ThreadSafeSingleton.getInstance();
		System.out.println(tss.hashCode());
		ThreadSafeSingleton tss1=ThreadSafeSingleton.getInstance();
		System.out.println(tss1.hashCode());
		ThreadSafeSingleton tss2=ThreadSafeSingleton.getInstance();
		System.out.println(tss2.hashCode());
	}

}
