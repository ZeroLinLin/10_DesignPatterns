package _1_creational._03_Singleton;
/**
 * ����1:��ͨ����ʽ
 
 * �̲߳���ȫ
 * @author Zero.Hegel
 *
 */
public class Singleton_1_LanHan {
	// 1������˽�о�̬ʵ������ֹ�����ã���ֵnull,Ŀ���ӳټ���
	private static Singleton_1_LanHan instance = null;
	
	// 2��˽�л����캯������ֹ��ʵ����
	private Singleton_1_LanHan() {}
	
	// 3����̬����������ʵ���������ṩ����
	/*
	 * ���߳��»��������,������ܶ�δ���
	 */
	public static Singleton_1_LanHan getInstance() {
		if (instance == null) {
			instance = new Singleton_1_LanHan();
		}
		return instance;
	}
	
	// ����ö����������л������Ա�֤���������л�ǰ�󱣳�һ��
	public Object readResolve() {
		return instance;
	}
}
