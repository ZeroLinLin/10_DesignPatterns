package _1_creational._03_Singleton;
/**
 *  ����7����̬����顪������ʽ

 * �̰߳�ȫ
 * @author Zero.Hegel
 *
 */
public class Singleton_7_StaticCodeSeg {
	// 1������˽�о�̬ʵ������ֹ�����ã���ֵnull,Ŀ���ӳټ���
	private static Singleton_7_StaticCodeSeg instance = null;
	
	static {
		instance = new Singleton_7_StaticCodeSeg();
	}
	
	// 2��˽�л����캯������ֹ��ʵ����
	private Singleton_7_StaticCodeSeg() {}
	
	// 3����̬�����������ṩ����
	public static Singleton_7_StaticCodeSeg getInstance() {
		return instance;
	}
}
