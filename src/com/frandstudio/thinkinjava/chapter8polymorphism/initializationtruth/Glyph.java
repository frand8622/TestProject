package com.frandstudio.thinkinjava.chapter8polymorphism.initializationtruth;

public class Glyph {
	
	//a protected method, will be overridden by derived class
	void draw(){
		System.out.println("Glyph.draw()");
	}
	
	//a private method, will no be overridden
	private void draw2(){
		System.out.println("Glyph.draw()2");
	}
	
	public Glyph(){
		System.out.println("Glyph() before draw()");
		draw();
		System.out.println("Glyph() after draw()");
		
		System.out.println();

		System.out.println("Glyph() before draw2()");
		draw2();
		System.out.println("Glyph() after draw2()");
		
	}
}
