package _3_behavioral.b_twoClass._17_ChainOfResponsibility;

public class Test {
	public static void main(String[] args) {
		MyHandler h1 = new MyHandler("h1");
		MyHandler h2 = new MyHandler("h2");
		MyHandler h3 = new MyHandler("h3");
		
		h1.SetHandler(h2);
		h2.SetHandler(h3);
		
		h1.operator();
		/*
		h1deal!
		h2deal!
		h3deal!
		*/
		// h1调用h2去处理，h2调用h3去处理
	}
}
