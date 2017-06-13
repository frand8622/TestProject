package com.frandstudio.thinkinjava.chapter10innerclasses;

import com.frandstudio.thinkinjava.chapter10innerclasses.Basic.*;

public class InnerClassBasic {

	public static void main(String[] args) {

		OutClass outClass = new OutClass();
		
//		OutClass.InnerClass1 innerClass1 = new OutClass.InnerClass1(); //cannot new a non-static inner class directly
		OutClass.InnerClass2 innerClass2 = new OutClass.InnerClass2(); //can new a static inner class directly, as it's a nested class
		innerClass2.testMethod2();
		
		//inner object must be created by out instance
		OutClass.InnerClass1 innerClass11 = outClass.getInnerClass1Instance(); //get inner instance from out object method
		innerClass11.testMethod1();
		
		OutClass.InnerClass2 innerClass22 = outClass.getInnerClass2Instance(); //get inner instance from out object method
		innerClass22.testMethod2();

		System.out.println("" + outClass.publicStr);
		outClass.testMethodInOutClass();
		
		System.out.println("[from out package]: " + "inner class instance cannot get outClass member directly by inner instance.");
//		System.out.println("" + innerClass22.publicStr); //inner class instance cannot get outClass member directly by inner instance.
//		innerClass22.testMethodInOutClass(); //inner class cannot get outClass member directly by inner instance.
		
//		OutClass.InnerClass3 innerClass3 = new OutClass.InnerClass3(); //cannot new a protected inner class from out package.
	}

}
