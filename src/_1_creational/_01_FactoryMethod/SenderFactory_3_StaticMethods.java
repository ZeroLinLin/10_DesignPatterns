package _1_creational._01_FactoryMethod;

import _1_creational.common.MailSender;
import _1_creational.common.Sender;
import _1_creational.common.SmsSender;

/**
 * _01_FactoryMethod_03 静态工厂方法模式
 * @author Zero.Hegel
 *
 */
public class SenderFactory_3_StaticMethods {
	public static Sender produceMail() {
		return new MailSender();
	}
	
	public static Sender produceSms() {
		return new SmsSender();
	}
}
