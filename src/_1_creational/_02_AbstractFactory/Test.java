package _1_creational._02_AbstractFactory;

import _1_creational.common.Sender;

/**
 * _02_AbstractFactory ������ģʽ������
 * @author Zero.Hegel
 *
 */
public class Test {
	public static void main(String[] args) {
		Provider provider = new MailSenderFactory();
		Sender sender = provider.produce();
		sender.send();
		//this is mailsender! 
	}  
}
/*
��ʵ���ģʽ�ĺô����ǣ����������������һ�����ܣ�����ʱ��Ϣ����ֻ����һ��ʵ���࣬
ʵ��Sender�ӿڣ�ͬʱ��һ�������࣬ʵ��Provider�ӿڣ���OK�ˣ�
����ȥ�Ķ��ֳɵĴ��롣����������չ�ԽϺã�
 */