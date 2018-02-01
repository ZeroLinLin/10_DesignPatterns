package _1_creational._04_Builder;
/**
 * _04_Builder 建造者模式
 * 
 *工 厂类模式提供的是创建单个类的模式，而建造者模式则是将各种产品集中起来进行管理，
 * 用来创建复合对象，所谓复合对象就是指某个类具有不同的属性，
 * 其实建造者模式就是前面抽象工厂模式和最后的Test结合起来得到的
 * @author Zero.Hegel
 *
 */

import java.util.ArrayList;
import java.util.List;

import _1_creational.common.MailSender;
import _1_creational.common.Sender;
import _1_creational.common.SmsSender;

public class Builder {
	private List<Sender> list = new ArrayList<Sender>();
	
	public void produceMailSender(int count) {
		for (int i=0; i<count; i++) {
			list.add(new MailSender());
		}
	}
	
	public void produceSmsSender(int count) {
		for (int i=0; i<count; i++) {
			list.add(new SmsSender());
		}
	}
}
