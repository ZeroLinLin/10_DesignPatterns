package _1_creational._01_FactoryMethod;

import _1_creational.common.MailSender;
import _1_creational.common.Sender;
import _1_creational.common.SmsSender;

/**
 * _01_FactoryMethod_02 多个工厂方法模式
 * @author Zero.Hegel
 *
 */
public class SenderFactory_2_Methods {
	public Sender produceMail() {
		return new MailSender();
	}
	
	public Sender produceSms() {
		return new SmsSender();
	}
}
