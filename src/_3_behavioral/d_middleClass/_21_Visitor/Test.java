package _3_behavioral.d_middleClass._21_Visitor;

public class Test {
	public static void main(String[] args) {
		
		Visitor visitor = new MyVisitor();
		Subject subject = new MySubject();
		subject.accept(visitor);
		
		//visit the subject£ºlove
	}
}
