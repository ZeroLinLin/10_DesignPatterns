package _3_behavioral.b_twoClass._15_Observer;

public interface Subject {
	/**���ӹ۲���
	 * @param observer
	 */
	public void add(Observer observer);
	
	/**
	 * ɾ���۲���
	 * @param observer
	 */
	public void del(Observer observer);
	
	/**
	 * ֪ͨ���й۲���
	 */
	public void notifyObservers();
	
	/**
	 *  �������
	 */
	public void operation();
}
