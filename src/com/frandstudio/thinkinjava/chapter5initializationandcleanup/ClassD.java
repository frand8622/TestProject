package com.frandstudio.thinkinjava.chapter5initializationandcleanup;

/**
 * 2 constructors with argument defined by author
 */
public class ClassD {
	public ClassD(String strArg){
//		this();	//call the default no-arg constructor is not allowed
		System.out.println("ClassD con1: " + strArg);
	}
	
	public ClassD(String strArg, int intArg){
		this(strArg);	//call the constructor with one arg
		System.out.println("ClassD con2: " + strArg + " " + intArg);
	}
	
	public static void publicStaticMethod() {
		
	}
	
	private static void privateStaticMethod1() {
		
	}
}
