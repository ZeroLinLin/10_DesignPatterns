package _3_behavioral.d_middleClass._23_Interpreter;

public class Test {
	public static void main(String[] args) {
		// ����9+2-8��ֵ
		int result = new Minus().interpret(new Context(new Plus().interpret(new Context(9, 2)), 8));
		System.out.println(result);
		//3
	}
}
