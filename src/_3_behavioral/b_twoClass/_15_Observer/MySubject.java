package _3_behavioral.b_twoClass._15_Observer;
/**
 * ������Ҫ֪ͨ���й۲���
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
