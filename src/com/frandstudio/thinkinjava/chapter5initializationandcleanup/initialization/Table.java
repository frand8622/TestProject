package com.frandstudio.thinkinjava.chapter5initializationandcleanup.initialization;

public class Table {
//	static int a = f2(1);	//static memeber cannot call no-static method
	int b = f2(2);
	int c = f22(3);
	{
		System.out.println("This is from no static initialization.");
	}
	
	static int d = f22(4);
	static{
		System.out.println("This is from static initialization.");
	}
	
	static Bowl b1 = new Bowl(1);
	static Bowl b2;

	public int f2(int marker) {
		System.out.println("f2(" + marker + ")");
		System.out.println("b1: " + b1);
		return marker;
	}

	static int f22(int marker) {
		System.out.println("f22(" + marker + ")");
		return marker;
	}
}