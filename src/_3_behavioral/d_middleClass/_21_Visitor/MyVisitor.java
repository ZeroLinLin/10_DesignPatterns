package _3_behavioral.d_middleClass._21_Visitor;

public class MyVisitor implements Visitor {

	@Override
	public void visit(Subject sub) {
		System.out.println("visit the subject£º" + sub.getSubject());
	}

}
