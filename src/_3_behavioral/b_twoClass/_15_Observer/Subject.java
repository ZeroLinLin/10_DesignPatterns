package _3_behavioral.b_twoClass._15_Observer;

public interface Subject {
	/**增加观察者
	 * @param observer
	 */
	public void add(Observer observer);
	
	/**
	 * 删除观察者
	 * @param observer
	 */
	public void del(Observer observer);
	
	/**
	 * 通知所有观察者
	 */
	public void notifyObservers();
	
	/**
	 *  自身操作
	 */
	public void operation();
}
