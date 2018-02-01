package _1_creational._03_Singleton;
/**
 *  ����6��˫��У�顪������ʽ

 * �̰߳�ȫ
 * ������getInstance()�ֿ�������Ϊ������synchronized�ؼ���
 * @author Zero.Hegel
 *
 */
public class Singleton_6_DoubleCheck {
	// 1������˽�о�̬ʵ������ֹ�����ã���ֵnull,Ŀ���ӳټ���
	private static Singleton_6_DoubleCheck instance = null;
	
	// 2��˽�л����캯������ֹ��ʵ����
	private Singleton_6_DoubleCheck() {}
	
	/*
	 * ������˫��У���������̰߳�ȫ�ģ����ң����ַ���ʵ����lazyloading��
	*/
	// ��ʼ����������Ϊͬ��
	private static synchronized void syscInit() {
		if (instance == null) {
			instance = new Singleton_6_DoubleCheck();
		}
	}
	// 3����̬����������ʵ���������ṩ����
	public static Singleton_6_DoubleCheck getInstance() {
		if (instance == null) {
			syscInit();
		}
		return instance;
	}
}
