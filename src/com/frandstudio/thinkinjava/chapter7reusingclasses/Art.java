package com.frandstudio.thinkinjava.chapter7reusingclasses;

public class Art {
	
	public String strA = "Art.strA";
	

	public void f1(int a) {
		System.out.println("public method: Art.f1(" + a + ")");
	}

	public void f2(String str) {
		System.out.println("public method: Art.f2(" + str + ")");

		System.out.println("\t" + strA);
	}
	
	private void f3(){
		System.out.println("private method: Art.f3()");
	}
	
	protected void f4(){
		System.out.println("protected method: Art.f4()");
	}
}
