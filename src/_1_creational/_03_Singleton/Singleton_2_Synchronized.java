package _1_creational._03_Singleton;
/**
 *  ����2��ʹ�����������������ʽ

 * �̰߳�ȫ�����ܵͣ�ÿ�λ�ȡʵ���������ȡ��
 * @author Zero.Hegel
 *
 */
public class Singleton_2_Synchronized {
	// 1������˽�о�̬ʵ������ֹ�����ã���ֵnull,Ŀ���ӳټ���
	private static Singleton_2_Synchronized instance = null;
	
	// 2��˽�л����캯������ֹ��ʵ����
	private Singleton_2_Synchronized() {}
	
	// 3����ʼ����������Ϊͬ��
	/*
	 * ������������ܵ�
	 */
	@SuppressWarnings("unused")
	private static synchronized Singleton_2_Synchronized getInstance() {
		if (instance == null) {
			instance = new Singleton_2_Synchronized();
		}
		return instance;
	}
}
