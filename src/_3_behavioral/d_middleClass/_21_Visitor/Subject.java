package _3_behavioral.d_middleClass._21_Visitor;
/**
 * Subject类，accept方法，接受将要访问它的对象，getSubject()获取将要被访问的属性
 * @author Zero.Hegel
 *
 */
public interface Subject {
	/**
	 * 接受将要访问它的对象
	 * @param visitor
	 */
	public void accept(Visitor visitor);
	/**
	 * 获取将要被访问的属性
	 * @return
	 */
	public String getSubject();
}
