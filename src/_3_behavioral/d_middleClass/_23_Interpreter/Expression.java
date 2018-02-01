package _3_behavioral.d_middleClass._23_Interpreter;

public interface Expression {
	/**
	 * 解析表达式
	 * @param context
	 * @return
	 */
	public int interpret(Context context);
}
