package com.frandstudio.thinkinjava.chapter7reusingclasses;

public class Cartoon extends Drawing {

	public static void main(String[] args) throws Exception{
		Art art_art = new Art();
		Art art_draw = new Drawing();
		Drawing draw = new Drawing();

		System.out.println("art_art:");
		art_art.f1(1);
		art_art.f2("art_art");
		art_art.f4();
		System.out.println(art_art.strA);	//always call base class field
		
		System.out.println();
		System.out.println("art_draw:");
		art_draw.f1(2);
		art_draw.f1('c');	//call the base class method by parameter up-case
		art_draw.f2("art_draw");
		art_draw.f4(); 
		System.out.println(art_draw.strA);	//always call base class field
		
		System.out.println();
		System.out.println("draw:");
		draw.f1('d');
		draw.f1(3);
		draw.f2("draw");
		draw.f4();
		System.out.println(draw.strA);
	}
}
