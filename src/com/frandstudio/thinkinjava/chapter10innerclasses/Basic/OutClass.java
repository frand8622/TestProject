package com.frandstudio.thinkinjava.chapter10innerclasses.Basic;

public class OutClass {

	public String publicStr = "public member.";
	protected String protectedStr = "protected member."; // cannot be access from out of package.
	private String privateStr = "private member.";

	public OutClass() {
		System.out.println("OutClass constructor.");
	}

	public static void main(String[] agrs) {

		// OutClass.InnerClass1 innerClass3 = new OutClass.InnerClass1();
		// //cannot new a non-static class directly
	}

	public void testMethodInOutClass() {

		System.out.println("" + publicStr);
		
		System.out.println("[from out class]: " + "inner class instance cannot get outClass member directly by inner instance.");
		InnerClass1 innerClass1 = new InnerClass1();
//		System.out.println("" + innerClass1.publicStr); //inner class instance cannot get outClass member directly by inner instance.
//		innerClass1.testMethodInOutClass(); //inner class cannot get outClass member directly by inner instance.
	}

	public InnerClass1 getInnerClass1Instance() {
		return new InnerClass1();
	}

	// type: non-static class
	public class InnerClass1 {
		public InnerClass1() {
			System.out.println("InnerClass1 constructor.");
		}

		public void testMethod1() {
			System.out.println("method 1.");
			
			//inner class(not instance) cannot access any type of out class member dirctly
			System.out.println("inner class(not instance) cannot access any type of out class member dirctly:\n\t"
			+publicStr + "\t" + protectedStr + "\t" + privateStr + "\t");
		}
	}

	// type: public static class
	public static class InnerClass2 {
		public InnerClass2() {
			System.out.println("InnerClass2 constructor.");
		}

		public void testMethod2() {
			System.out.println("method 2.");
		}
	}

	// type: protected static class
	static class InnerClass3 {
		public InnerClass3() {
			System.out.println("InnerClass3 constructor.");
		}

		public void testMethod3() {
			System.out.println("method 3.");
		}
	}

	public InnerClass2 getInnerClass2Instance() {
		return new InnerClass2();
	}

}
