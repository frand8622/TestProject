package com.frandstudio.thinkinjava.chapter14RTTI;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;

public class TestClassB {

		private static String str = "test str";
	
	public static void main(String[] args) throws Exception{
		if(args.length < 1)
		{
			System.out.println("args length is less than 1.");
		}
		else
		{
			System.out.println("args length: " + args.length);
			System.out.println(args[0]);
		}
		
		TestClassA a = new TestClassA("abc");
		System.out.println(a.toString());
		System.out.println(new TestClassB().toString());
		
		System.out.println("class in one package: \t\t" + Class.forName("com.frandstudio.thinkinjava.chapter14RTTI.TestClassA").getName());
		System.out.println("class in one file: \t\t" + Class.forName("com.frandstudio.thinkinjava.chapter14RTTI.TestClassC").getName());
		System.out.println("newInstance: \t\t" + Class.forName("com.frandstudio.thinkinjava.chapter14RTTI.TestClassC").newInstance().toString());
		
		
		System.out.println("inner class full qualified name: \t\t" + Class.forName("com.frandstudio.thinkinjava.chapter14RTTI.TestClassB$TestClassD").getName());
		TestClassD d = new TestClassB().geTestClassD();
		System.out.println("inner class object: \t\t" + d.getClass().getName());
		
		System.out.println(Class.forName("java.lang.Class").getName());
		
		System.out.println("TestClassA.class: \t\t" + TestClassA.class);
		
		Class class1 = TestClassA.class;
		System.out.println("class1.getName(): \t\t" + class1.getName()); 
		System.out.println("fields length: \t\t" + class1.getFields().length + "\t only get self and parent public fields.");
		for(Field field : class1.getFields())
		{
			System.out.println("\t\t\t\t" + field.getName());
		}
		System.out.println("methods length: \t" + class1.getMethods().length + "\t only get self and parent public methods.");
		for(int i=0; i<class1.getMethods().length; i++)
		{
			System.out.println("\t\t\t\t" + class1.getMethods()[i].getName());
		}
		
		TestClassA a2 = new TestClassA("");
		if(TestClassA.class.isInstance(a2))
			System.out.println("###### isInstance(): a2 IS an instance of TestClassA ######");
		else
			System.out.println("###### isInstance(): a2 IS NOT an instance of TestClassA ######");
		
		if(a2 instanceof TestClassA)
			System.out.println("###### instanceof: a2 IS an instance of TestClassA ######");
		else
			System.out.println("###### instanceof: a2 IS NOT an instance of TestClassA ######");
		
		TestClassC c_e = new TestClassE();
		System.out.println("upcast 1: \t\t" + c_e.getClass().getName());
		System.out.println("instanceof 1 \t\t" + (c_e instanceof TestClassE? "yes" : "no"));

		List<TestClassC> c_List = Arrays.asList(new TestClassE());
		System.out.println("upcast 2: \t\t" + c_List.getClass().getName());
		System.out.println("upcast 3: \t\t" + c_List.get(0).getClass().getName());
		System.out.println("instanceof 2 \t\t" + (c_List.get(0) instanceof TestClassE? "yes" : "no"));
		
	}
	
	class TestClassD{
		
	}
	
	TestClassD geTestClassD()
	{return new TestClassD();}

}

class TestClassC{
	
}

class TestClassE extends TestClassC{
	
}
