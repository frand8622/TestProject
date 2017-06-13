package com.frandstudio.thinkinjava.chapter14RTTI;

public class TestClassA extends BaseClass {
	public String strA;
	private String strB;
	protected String strC;
	
	public int iA;
	private int iB;
	protected int iC;
	
	static{
		System.out.println("static block of TestClassA.");
	}
	
	TestClassA(String str){}
	
	public String toString(){
		return this.getClass().getName();
	}
	
	public void method1(){}
	private void method2(){}
	protected void method3(){}
}

class BaseClass{
	public String basePublicStr;
	private String basePrivateStr;

	public void basePublicMethod(){}
	private void basePrivateMethod(){}
}
