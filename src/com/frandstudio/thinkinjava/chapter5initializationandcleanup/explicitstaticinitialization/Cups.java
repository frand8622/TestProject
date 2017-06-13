package com.frandstudio.thinkinjava.chapter5initializationandcleanup.explicitstaticinitialization;

public class Cups {

	static{
		System.out.println("base class static block 1.");
	}
	
	{
		System.out.println("base class non-static block 1.");
	}
	
	static{
		System.out.println("base class static block 2.");
	}
	
	{
		System.out.println("base class non-static block 2.");
	}
	
	static Cup cup1 = new Cup(1);
	static Cup cup2;
	
	Cup cup3 = new Cup(3);
	Cup cup4;
	
	static{
		cup2 = new Cup(2);
		System.out.println("load at base class static block.");
	}
	
//	protected{	//not allowed for block
	{
		cup4 = new Cup(4);
		System.out.println("load at base class non-static block.");
	}
	
	public Cups() {
		System.out.println("Cups()");
	}

	public static void main(String[] args) {
		System.out.println("Only Class and main are both public, the main() will be executed as an entry method.");
	}
}
