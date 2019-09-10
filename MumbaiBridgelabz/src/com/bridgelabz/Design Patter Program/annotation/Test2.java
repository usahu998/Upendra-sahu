package com.bridgelabz.designPatternProgram.annotation;

import java.util.ArrayList;

public class Test2 extends Annotation {

	@Deprecated
	public void show() {
	}

	@SuppressWarnings({ "rawtypes", "unused" })
	@Override
	public void showMyData() {
		ArrayList obj = new ArrayList();
		System.out.println(" in Test2");
	}
}
