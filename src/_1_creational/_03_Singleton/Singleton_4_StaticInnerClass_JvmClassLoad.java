package _1_creational._03_Singleton;
/**
 * ����4����̬���ڲ����ء�������ʽ

 * �̰߳�ȫ
 * ����ģʽʹ���ڲ�����ά��������ʵ�֣�JVM�ڲ��Ļ����ܹ���֤��һ���౻���ص�ʱ�������ļ��ع������̻߳���ġ�
 * @author Zero.Hegel
 *
 */
public class Singleton_4_StaticInnerClass_JvmClassLoad {
	// 1��˽�л����캯������ֹ��ʵ����
	private Singleton_4_StaticInnerClass_JvmClassLoad() {}
	
	// 2���˴�ʹ��һ���ڲ�����ά������
	/*
	 * ʹ���ڲ���ĺô��ǣ���̬�ڲ��಻���ڵ�������ʱ�ͼ��أ������ڵ���getInstance()����ʱ�Ž��м��أ�
	 * �ﵽ����������ģʽ��Ч���������ַ��������̰߳�ȫ�ġ�
	 */
	public static class SingletonFactory {
		private static Singleton_4_StaticInnerClass_JvmClassLoad instance = new Singleton_4_StaticInnerClass_JvmClassLoad();
	}
	
	// ��̬����������ʵ���������ṩ����
	public static Singleton_4_StaticInnerClass_JvmClassLoad getInstance() {
		return SingletonFactory.instance;
	}
	
	// ����ö����������л������Ա�֤���������л�ǰ�󱣳�һ��
	public Object readResolve() {
		return getInstance();
	}
}
