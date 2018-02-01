package _1_creational._03_Singleton;
/**
 * 方法5：枚举方法实现单例

 * 线程安全
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
Effective Java作者Josh Bloch 提倡的方式，在我看来简直是来自神的写法。解决了以下三个问题：
(1)自由序列化。
(2)保证只有一个实例。
(3)线程安全。

Singleton_5_Enum.INSTANCE.method();
 */