package _1_creational._02_AbstractFactory;

import _1_creational.common.Sender;

/**
 * 提供一个接口
 * @author Zero.Hegel
 *
 */
public interface Provider {
	public Sender produce();
}
