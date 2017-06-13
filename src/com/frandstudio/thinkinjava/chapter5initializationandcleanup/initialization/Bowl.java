package com.frandstudio.thinkinjava.chapter5initializationandcleanup.initialization;

public class Bowl {
	public Bowl(int marker) {
		System.out.println("Bowl(" + marker + ")");
	}
	
	void f1(int marker){
		System.out.println("f1(" + marker + ")");
	}
}
