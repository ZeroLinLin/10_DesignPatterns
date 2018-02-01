package _1_creational._03_Singleton;
/**
 * ����3������ʽ
 
 * �̰߳�ȫ
 * @author Zero.Hegel
 *
 */
public class Singleton_3_EHan {
	// 1������˽�о�̬ʵ������ֹ������
	/*
	 * ����ʽ����Ϊ����ػ��ƣ����󲻻��δ���
	 */
	private static Singleton_3_EHan instance = new Singleton_3_EHan();
	
	// 2��˽�л����캯������ֹ��ʵ����
	private Singleton_3_EHan() {}
	
	// 3����̬����������ʵ���������ṩ����
	public static Singleton_3_EHan getInstance() {
		return instance;
	}
	
	// ����ö����������л������Ա�֤���������л�ǰ�󱣳�һ��
	public Object readResolve() {
		return instance;
	}
}
