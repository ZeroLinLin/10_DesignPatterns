package _3_behavioral.b_twoClass._15_Observer;
/**
 * 操作需要通知所有观察者
 * @author Zero.Hegel
 *
 */
public class MySubject extends AbstractSubject {

	@Override
	public void operation() {
		System.out.println("update self");
		notifyObservers();
	}

}
