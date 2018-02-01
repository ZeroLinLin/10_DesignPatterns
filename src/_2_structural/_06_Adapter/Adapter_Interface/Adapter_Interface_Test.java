package _2_structural._06_Adapter.Adapter_Interface;

public class Adapter_Interface_Test {
	
	public static void main(String[] args) {
		Sourceable source1 = new SourceSub1();
		Sourceable source2 = new SourceSub2();
		
		source1.method1(); //1
		source1.method2();
		
		source2.method1();
		source2.method2(); //2
		/*
		this sourceable interface's first sub1 !
		this sourceable interface's first sub2 !
		*/
	}
}
