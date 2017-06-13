package com.frandstudio.thinkinjava.chapter8polymorphism;

public class RTTI {
	public static void main(String[] args) throws Exception{
		Useful[] x = {new Useful(), new MoreUseful()};
		
		x[0].f();
		x[1].g();
		
		((MoreUseful)x[0]).u();	//will get a run time error:  java.lang.ClassCastException
		((MoreUseful)x[1]).u();
	}
}

class Useful{
	public void f(){}
	public void g(){}
}

class MoreUseful extends Useful{
	public void f(){}
	public void g(){}
	public void u(){}
}