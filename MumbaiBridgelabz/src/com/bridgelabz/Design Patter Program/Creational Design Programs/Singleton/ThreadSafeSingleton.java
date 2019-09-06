package com.bridgelabz.designPatternProgram.CreationalDesignPattern.Singletonlink;

public class ThreadSafeSingleton {
	 private static ThreadSafeSingleton instance;
	    
	    private ThreadSafeSingleton(){}
	    
	    public static synchronized ThreadSafeSingleton getInstance(){
	        if(instance == null){
	            instance = new ThreadSafeSingleton();
	        }
	        return instance;
	    }
//                           OR	    
//	    public static ThreadSafeSingleton getInstanceUsingDoubleLocking(){
//	        if(instance == null){
//	            synchronized (ThreadSafeSingleton.class) {
//	                if(instance == null){
//	                    instance = new ThreadSafeSingleton();
//	                }
//	            }
//	        }
//	        return instance;
//	    }
}
