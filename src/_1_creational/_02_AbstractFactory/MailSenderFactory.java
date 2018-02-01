package _1_creational._02_AbstractFactory;

import _1_creational.common.MailSender;
import _1_creational.common.Sender;

public class MailSenderFactory implements Provider {

	@Override
	public Sender produce() {
		return new MailSender();
	}

}
