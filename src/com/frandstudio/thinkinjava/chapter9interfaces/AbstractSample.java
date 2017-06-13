package com.frandstudio.thinkinjava.chapter9interfaces;

//must implement the abstract method of the base abstract class
//Or there will have a compile time error
public class AbstractSample extends BaseClass {

	@Override
	void play(String str) {
		System.out.println("AbstractSample.play("+str+")");
	}

	@Override
	void ajust() {
		System.out.println("AbstractSample.ajust()");
	}
	
	void what(){
		System.out.println("override the BaseClass.what() from AbstractSample.what()");
		System.out.print("\t");
		super.what();
	}
	
	public static void main(String[] args) throws Exception{
		BaseClass sample = new AbstractSample();
//		BaseClass sample2 = new BaseClass();	//Error: cannot instantiate this type
		BaseClass sample3 = new BaseClass() {
			
			@Override
			void play(String str) {
				System.out.println("play for sample3. " + str);
			}
			
			@Override
			void ajust() {
				System.out.println("play for sample3.");
			}
		};
		
		sample.play("this is a sample");
		sample.ajust();
		sample.what();
		
		System.out.println("----------------------");
		
		sample3.play("it is a diffent sample");
		sample3.ajust();
		sample3.what();
	}

}


abstract class BaseClass{
	abstract void play(String str);
	abstract void ajust();
	
	void what(){
		System.out.println("BaseClass.what()");
	}
}