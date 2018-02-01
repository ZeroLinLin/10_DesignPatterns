package _1_creational._02_AbstractFactory;

import _1_creational.common.Sender;
import _1_creational.common.SmsSender;

public class SmsSenderFactory implements Provider {

	@Override
	public Sender produce() {
		return new SmsSender();
	}

}
