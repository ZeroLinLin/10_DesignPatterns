package _3_behavioral.d_middleClass._21_Visitor;
/**
 * Subject�࣬accept���������ܽ�Ҫ�������Ķ���getSubject()��ȡ��Ҫ�����ʵ�����
 * @author Zero.Hegel
 *
 */
public interface Subject {
	/**
	 * ���ܽ�Ҫ�������Ķ���
	 * @param visitor
	 */
	public void accept(Visitor visitor);
	/**
	 * ��ȡ��Ҫ�����ʵ�����
	 * @return
	 */
	public String getSubject();
}
