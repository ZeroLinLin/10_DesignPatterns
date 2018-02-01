package _1_creational._03_Singleton;
/**
 * 方法3：饿汉式
 
 * 线程安全
 * @author Zero.Hegel
 *
 */
public class Singleton_3_EHan {
	// 1、持有私有静态实例，防止被引用
	/*
	 * 饿汉式，因为类加载机制，对象不会多次创建
	 */
	private static Singleton_3_EHan instance = new Singleton_3_EHan();
	
	// 2、私有化构造函数，防止被实例化
	private Singleton_3_EHan() {}
	
	// 3、静态方法，创建实例，对外提供调用
	public static Singleton_3_EHan getInstance() {
		return instance;
	}
	
	// 如果该对象被用于序列化，可以保证对象在序列化前后保持一致
	public Object readResolve() {
		return instance;
	}
}
