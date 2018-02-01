package _1_creational._03_Singleton;
/**
 * 方法1:普通懒汉式
 
 * 线程不安全
 * @author Zero.Hegel
 *
 */
public class Singleton_1_LanHan {
	// 1、持有私有静态实例，防止被引用，赋值null,目的延迟加载
	private static Singleton_1_LanHan instance = null;
	
	// 2、私有化构造函数，防止被实例化
	private Singleton_1_LanHan() {}
	
	// 3、静态方法，创建实例，对外提供调用
	/*
	 * 多线程下会出现问题,对象可能多次创建
	 */
	public static Singleton_1_LanHan getInstance() {
		if (instance == null) {
			instance = new Singleton_1_LanHan();
		}
		return instance;
	}
	
	// 如果该对象被用于序列化，可以保证对象在序列化前后保持一致
	public Object readResolve() {
		return instance;
	}
}
