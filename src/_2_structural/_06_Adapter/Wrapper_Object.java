package _2_structural._06_Adapter;
/**
 * _06_Adapter_02 ������ģʽ ֮ �������������ģʽ��
 * 
 * Adapterʵ��Targetable�ӿڣ�����Source�Ķ���
 * ����Targetable�ӿڵ�ʵ����;�����Source��Ĺ���
 * @author Zero.Hegel
 *
 */
public class Wrapper_Object implements Targetable {
	private Source source;
	
	public Wrapper_Object(Source source) {
		super();
		this.source = source;
	}
	
	@Override
	public void method2() {
		System.out.println("this is the targetable method2!");
	}

	@Override
	public void method1() {
		// ����Source����ķ���
		source.method1();
	}

}
