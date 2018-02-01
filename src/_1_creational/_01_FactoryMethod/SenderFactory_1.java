package _1_creational._01_FactoryMethod;

import _1_creational.common.MailSender;
import _1_creational.common.Sender;
import _1_creational.common.SmsSender;

/**
 * _01_FactoryMethod_1 ��ͨ����ģʽ
 * @author Zero.Hegel
 *
 */
public class SenderFactory_1 {
	public Sender produce(String type) {
		if ("mail".equals(type)) {
			return new MailSender();
		} else if ("sms".equals(type)) {
			return new SmsSender();
		} else {
			System.out.println("��������ȷ�����ͣ�");
			return null;
		}
	}
}
