package _1_creational._03_Singleton;
/**
 *  方法7：静态代码块——饿汉式

 * 线程安全
 * @author Zero.Hegel
 *
 */
public class Singleton_7_StaticCodeSeg {
	// 1、持有私有静态实例，防止被引用，赋值null,目的延迟加载
	private static Singleton_7_StaticCodeSeg instance = null;
	
	static {
		instance = new Singleton_7_StaticCodeSeg();
	}
	
	// 2、私有化构造函数，防止被实例化
	private Singleton_7_StaticCodeSeg() {}
	
	// 3、静态方法，对外提供调用
	public static Singleton_7_StaticCodeSeg getInstance() {
		return instance;
	}
}
