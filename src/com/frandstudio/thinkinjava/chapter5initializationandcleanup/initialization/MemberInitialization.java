package com.frandstudio.thinkinjava.chapter5initializationandcleanup.initialization;

public class MemberInitialization {
	
	int intFieldA;
	String strFieldA;
	
	int intFieldB = g(3);
	
	int g(int i){
		int intLocalB = 2;
		System.out.println("intLocalB: " + intLocalB);
		return intLocalB * 2;
	}
	
	public MemberInitialization() {
		// TODO Auto-generated constructor stub
		System.out.println("from construction.");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		new MemberInitialization();
		
//		System.out.println("Static field has no initialization:");
//		System.out.println(Table.b2);

//		System.out.println("Initialize by call the calss static field:");
//		System.out.println(Table.d);
		
		System.out.println("Initialize by call the class static method:");
		System.out.println(Table.f22(5));
		
//		System.out.println("Initialize by new an instance:");
//		Table t1 = new Table();
//		System.out.println(t1.b);
	}

}
