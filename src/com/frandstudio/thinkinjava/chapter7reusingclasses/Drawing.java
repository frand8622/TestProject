package com.frandstudio.thinkinjava.chapter7reusingclasses;

public class Drawing extends Art {
	
	public String strA = "Drawing.strA";

//	@Override //must override a method in base class
//	This method is actual a overload method
	public void f1(char c) {
		System.out.println("public method: Drawing.f1(" + c + ")");
	}

	@Override
	public void f2(String str) {
		System.out.println("public method: Drawing.f2(" + str + ")");

		System.out.println("\t" + strA + " | " + super.strA);
	}
	
//	@Override
//	public void f4(){
//		System.out.println("public method: Drawing.f4()");
//	}
}
