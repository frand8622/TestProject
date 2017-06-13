package com.frandstudio.thinkinjava.chapter8polymorphism.initialization;

public class Sandwich extends PortableLunch {
	private Bread bread = new Bread();
	private Cheese cheese = new Cheese();
	
	{System.out.println("Sandwich field.");}
	
	public Sandwich(){
		System.out.println("Sandwich()");
	}
	
	
	public static void main(String[] args) throws Exception{
		new Sandwich();
	}

}
