package com.bridgelabz.designPatternProgram.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class MainReflection {
	public static void main(String[] args) throws NoSuchMethodException, SecurityException, NoSuchFieldException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		Reflection ref = new Reflection();
		 // Creating class object from the object using getclass method 
		Class cls = ref.getClass();
		
		System.out.println("the name of the class is "+cls.getName());
		
		Constructor cnstr = cls.getConstructor();
		
		System.out.println("the name of the constructor "+cnstr.getName());
		
		System.out.println("The public methods are");
		
		Method[] methods = cls.getMethods();
		
		for(Method method : methods)
		{
			System.out.println(method.getName());
		}
		
		Method methodl = cls.getDeclaredMethod("method2", int.class);
		
		methodl.invoke(ref, 19);
		
		Field field = cls.getDeclaredField("string");
		field.setAccessible(true);
		
		Method methodll = cls.getDeclaredMethod("method3");
		methodll.setAccessible(true);
		methodll.invoke(ref);
	}
		
	

}
