package _2_structural._06_Adapter;

public class Test {
	public static void main(String[] args) {
		// 1、类的适配器模式
		/*Targetable target = new Adapter_Class();
		target.method1();
		target.method2();*/
		/*
		  this is original method!
		  this is the targetable method2! 
		 */
		
		// 2、对象的适配器模式
		Source source = new Source();
		Targetable target = new Wrapper_Object(source);
		target.method1();
		target.method2();
		/*
		 this is original method!
		 this is the targetable method2!
		*/
	}
}
