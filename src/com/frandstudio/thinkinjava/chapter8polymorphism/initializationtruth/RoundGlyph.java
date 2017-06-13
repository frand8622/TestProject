package com.frandstudio.thinkinjava.chapter8polymorphism.initializationtruth;

public class RoundGlyph extends Glyph{
	private int radius = 1;
	private int radius2 = 2;
	
	public RoundGlyph(int r){
		radius = r;
		radius2 = ++r;
		System.out.println("RoundGlyph.RoundGlyph(), radius = " + radius);
		System.out.println("RoundGlyph.RoundGlyph(), radius = " + radius);
	}
	
	@Override
	void draw(){
		System.out.println("RoundGlyph.draw(), radius = " + radius);
	}
	
	private void draw2(){
		System.out.println("RoundGlyph.draw()2, radius2 = " + radius2);
	}
}
