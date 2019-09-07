package com.bridgelabz.designPatternProgram.CreationalDesignPattern.ProtoTypeDesignPattern;

import java.util.List;

public class MainprototypePattern {

	public static void main(String[] args) throws CloneNotSupportedException {
		
		Employees emps=new Employees();
		emps.loadData();
		
		Employees empNew =(Employees) emps.clone();
		Employees empNew1 =(Employees) emps.clone();
		
		List<String> list = empNew.getEmpList();
		list.add("Ajay");
		List<String> list1 = empNew1.getEmpList();
		list1.remove("Somesh");
		
		System.out.println("emps List : "+emps.getEmpList());
		System.out.println("empsNew List: "+list);
		System.out.println("empsNew1 List: "+list1);
	}

}
