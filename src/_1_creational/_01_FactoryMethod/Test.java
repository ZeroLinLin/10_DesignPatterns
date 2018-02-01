package _1_creational._01_FactoryMethod;

import _1_creational.common.Sender;

/**
 * 工厂测试类
 * @author Zero.Hegel
 *
 */
public class Test {
	public static void main(String[] args) {
		//_01_FactoryMethod_1 普通工厂模式
		/*SenderFactory factory = new SenderFactory();
		Sender sender = factory.produce("sms");
		sender.send();*/
		//this is smssender!
		
		//_01_FactoryMethod_02 多个工厂方法模式
		/*SenderFactory2 factory = new SenderFactory2();
		Sender sender = factory.produceMail();
		sender.send();*/
		//this is mailsender!
		
		//_01_FactoryMethod_03 静态工厂方法模式
		Sender sender = SenderFactory_3_StaticMethods.produceMail();
		sender.send();
		//this is mailsender!
	}
}
/*
总体来说，工厂模式适合：
凡是出现了大量的产品需要创建，并且具有共同的接口时，可以通过工厂方法模式进行创建。
以上的在三种模式中，第一种如果传入的字符串有误，不能正确创建对象，
第三种相对于第二种，不需要实例化工厂类，
所以，大多数情况下，我们会选用第三种——静态工厂方法模式。
*/