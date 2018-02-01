package _1_creational._03_Singleton;
/**
 *  方法2：使用类对象锁——懒汉式

 * 线程安全，性能低，每次获取实例都请求获取锁
 * @author Zero.Hegel
 *
 */
public class Singleton_2_Synchronized {
	// 1、持有私有静态实例，防止被引用，赋值null,目的延迟加载
	private static Singleton_2_Synchronized instance = null;
	
	// 2、私有化构造函数，防止被实例化
	private Singleton_2_Synchronized() {}
	
	// 3、初始化方法设置为同步
	/*
	 * 锁是类对象，性能低
	 */
	@SuppressWarnings("unused")
	private static synchronized Singleton_2_Synchronized getInstance() {
		if (instance == null) {
			instance = new Singleton_2_Synchronized();
		}
		return instance;
	}
}
