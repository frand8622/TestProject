package com.frandstudio.thinkinjava.chapter5initializationandcleanup.explicitstaticinitialization;

//public class Cup { //public class name must be same as file name
	   class Cup {	//no public, class name could not be same as file name
	public Cup(int marker) {
		System.out.println("Cup(" + marker + ")");
	}

	void f(int marker) {
		System.out.println("f(" + marker + ")");
	}

	//the main will not be executed, as Cup is not a public class.
	public static void main(String[] args) {
		System.out.println("the Cup.main() will not be an entry method, as Cup is not a public class.");
	}
}
