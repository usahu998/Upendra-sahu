package com.bridgelabz.designPatternProgram.CreationalDesignPattern.Singletonlink;

public class MainBillPughSingleton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BillPughSingleton bps=BillPughSingleton.getInstance();
		System.out.println(bps.hashCode());
		BillPughSingleton bps1=BillPughSingleton.getInstance();
		System.out.println(bps1.hashCode());
	}

}
