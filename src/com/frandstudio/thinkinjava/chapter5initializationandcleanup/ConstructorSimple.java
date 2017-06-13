package com.frandstudio.thinkinjava.chapter5initializationandcleanup;

public class ConstructorSimple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassA classA = new ClassA();
		
		ClassB classB = new ClassB();
		
		ClassC classC = new ClassC("arg in C");
//		classC classC2 = new ClassC();
		
//		ClassD classD = new ClassD();
		ClassD classD1 = new ClassD("str arg in D con1");
		ClassD classD2 = new ClassD("str arg in D con2", 2);
		
		ClassD.publicStaticMethod();
		classD1.publicStaticMethod();
//		ClassD.privateStaticMethod1();	//cannot call private method
	}

}
