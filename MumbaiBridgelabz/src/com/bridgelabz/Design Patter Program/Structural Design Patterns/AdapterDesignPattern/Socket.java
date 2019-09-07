package com.bridgelabz.designPatternProgram.structuralDesignPattern.AdapterDesignPattern;

public class Socket {
	public Volt getVolt(){
		return new Volt(120);
	}

}
