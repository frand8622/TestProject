package com.frandstudio.thinkinjava.chapter5initializationandcleanup.explicitstaticinitialization;

public class ExplicitStatic {

	public static void main(String[] args) {
		System.out.println("Inside main()");
		Cups.cup1.f(99);
		
		System.out.println();
		
		Cups cups = new Cups();
		cups.cup3.f(88);
		
		System.out.println();
		
		Cups.cup2.f(100);
		
		Cup.main(args);
	}

}
