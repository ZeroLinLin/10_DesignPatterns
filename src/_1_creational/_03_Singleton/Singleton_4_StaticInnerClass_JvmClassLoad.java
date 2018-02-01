package _1_creational._03_Singleton;
/**
 * 方法4：静态类内部加载——懒汉式

 * 线程安全
 * 单例模式使用内部类来维护单例的实现，JVM内部的机制能够保证当一个类被加载的时候，这个类的加载过程是线程互斥的。
 * @author Zero.Hegel
 *
 */
public class Singleton_4_StaticInnerClass_JvmClassLoad {
	// 1、私有化构造函数，防止被实例化
	private Singleton_4_StaticInnerClass_JvmClassLoad() {}
	
	// 2、此处使用一个内部类来维护单例
	/*
	 * 使用内部类的好处是，静态内部类不会在单例加载时就加载，而是在调用getInstance()方法时才进行加载，
	 * 达到了类似懒汉模式的效果，而这种方法又是线程安全的。
	 */
	public static class SingletonFactory {
		private static Singleton_4_StaticInnerClass_JvmClassLoad instance = new Singleton_4_StaticInnerClass_JvmClassLoad();
	}
	
	// 静态方法，创建实例，对外提供调用
	public static Singleton_4_StaticInnerClass_JvmClassLoad getInstance() {
		return SingletonFactory.instance;
	}
	
	// 如果该对象被用于序列化，可以保证对象在序列化前后保持一致
	public Object readResolve() {
		return getInstance();
	}
}
