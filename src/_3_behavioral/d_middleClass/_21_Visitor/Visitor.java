package _3_behavioral.d_middleClass._21_Visitor;

public interface Visitor {
	/**
	 * 访问者访问主题
	 * @param sub
	 */
	public void visit(Subject sub);
}
