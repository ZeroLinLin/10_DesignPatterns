package _1_creational._03_Singleton;
/**
 * ����5��ö�ٷ���ʵ�ֵ���

 * �̰߳�ȫ
 * @author Zero.Hegel
 *
 */
public enum Singleton_5_Enum {
	INSTANCE;
	public void method() {
		System.out.println("singleton enum method!");
	}
}
/*
Effective Java����Josh Bloch �ᳫ�ķ�ʽ�����ҿ�����ֱ���������д��������������������⣺
(1)�������л���
(2)��ֻ֤��һ��ʵ����
(3)�̰߳�ȫ��

Singleton_5_Enum.INSTANCE.method();
 */