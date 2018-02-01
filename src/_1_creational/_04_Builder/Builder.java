package _1_creational._04_Builder;
/**
 * _04_Builder ������ģʽ
 * 
 *�� ����ģʽ�ṩ���Ǵ����������ģʽ����������ģʽ���ǽ����ֲ�Ʒ�����������й���
 * �����������϶�����ν���϶������ָĳ������в�ͬ�����ԣ�
 * ��ʵ������ģʽ����ǰ����󹤳�ģʽ������Test��������õ���
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
