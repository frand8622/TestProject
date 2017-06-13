package com.frandstudio.thinkinjava.chapter2fieldsandmethods;

public class TestClassB {
	
	String strA;
	int intA;
	TestClassA classA;
	
	public void testCallMethod() throws Exception
	{
//		String strB;
//		int intB;
//		testClassA classB;

		String strB = null;
		int intB = 0;
		TestClassA classB = null;
		
		System.out.println("strA " + strA + " intA: " + intA + " innerClassA: " + classA);
		System.out.println("strB " + strB + " intB: " + intB + " innerClassB: " + classB);
	}

}
