package _2_structural._06_Adapter;
/**
 * _06_Adapter_01 ������ģʽ ֮ �����������ģʽ��
 * 
 * Adapter��̳�Source�࣬ʵ��Targetable�ӿ�
 * ����Targetable�ӿڵ�ʵ����;�����Source��Ĺ���
 * @author Zero.Hegel
 *
 */
public class Adapter_Class extends Source implements Targetable {

	@Override
	public void method2() {
		System.out.println("this is the targetable method2!");
	}

}
