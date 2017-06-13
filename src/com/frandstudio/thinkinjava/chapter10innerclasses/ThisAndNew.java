package com.frandstudio.thinkinjava.chapter10innerclasses;

public class ThisAndNew {
	void f(String str){
		System.out.println("ThisAndNew.f():\t"+str);
	}
	
	public Inner inner(){
		return new Inner();
	}

	public static void main(String[] args) {
		ThisAndNew out = new ThisAndNew();
		ThisAndNew.Inner inner = out.inner();
		inner.outer().f("ThisAndNew.this - \"this\" is refer to inner class instance");
		
		ThisAndNew.Inner inner2 = out.new Inner(); //inner object must be created by out instance
		inner2.outer().f("the out instance new a inner object.");
	}
	
	class Inner{
		public ThisAndNew outer(){
			return ThisAndNew.this; 
		}
	}
}
