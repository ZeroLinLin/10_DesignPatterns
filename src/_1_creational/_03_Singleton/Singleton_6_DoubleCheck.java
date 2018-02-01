package _1_creational._03_Singleton;
/**
 *  方法6：双重校验——懒汉式

 * 线程安全
 * 创建和getInstance()分开，单独为创建加synchronized关键字
 * @author Zero.Hegel
 *
 */
public class Singleton_6_DoubleCheck {
	// 1、持有私有静态实例，防止被引用，赋值null,目的延迟加载
	private static Singleton_6_DoubleCheck instance = null;
	
	// 2、私有化构造函数，防止被实例化
	private Singleton_6_DoubleCheck() {}
	
	/*
	 * 理论上双重校验锁法是线程安全的，并且，这种方法实现了lazyloading。
	*/
	// 初始化方法设置为同步
	private static synchronized void syscInit() {
		if (instance == null) {
			instance = new Singleton_6_DoubleCheck();
		}
	}
	// 3、静态方法，创建实例，对外提供调用
	public static Singleton_6_DoubleCheck getInstance() {
		if (instance == null) {
			syscInit();
		}
		return instance;
	}
}
