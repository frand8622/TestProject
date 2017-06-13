package com.frandstudio.thinkinjava.chapter5initializationandcleanup.explicitstaticinitialization;

public class CupsDerived extends Cups{

	static{
		System.out.println("derived class static block 1.");
	}
	
	{
		System.out.println("derived class none-static block 1.");
	}
	
	static{
		System.out.println("derived class static block 2.");
	}
	
	{
		System.out.println("derived class none-static block 2.");
	}

	static Cup cup5 = new Cup(5);
	static Cup cup6;

	Cup cup7 = new Cup(7);
	Cup cup8;

	static{
		cup6 = new Cup(6);
		System.out.println("load at derived class static block.");
	}
	
//	protected{	//not allowed for block
	{
		cup8 = new Cup(8);
		System.out.println("load at derived class non-static block.");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("before new CupsDerived()");
		new CupsDerived();
		System.out.println("after new CupsDerived()");
	}

}
