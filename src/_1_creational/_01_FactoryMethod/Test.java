package _1_creational._01_FactoryMethod;

import _1_creational.common.Sender;

/**
 * ����������
 * @author Zero.Hegel
 *
 */
public class Test {
	public static void main(String[] args) {
		//_01_FactoryMethod_1 ��ͨ����ģʽ
		/*SenderFactory factory = new SenderFactory();
		Sender sender = factory.produce("sms");
		sender.send();*/
		//this is smssender!
		
		//_01_FactoryMethod_02 �����������ģʽ
		/*SenderFactory2 factory = new SenderFactory2();
		Sender sender = factory.produceMail();
		sender.send();*/
		//this is mailsender!
		
		//_01_FactoryMethod_03 ��̬��������ģʽ
		Sender sender = SenderFactory_3_StaticMethods.produceMail();
		sender.send();
		//this is mailsender!
	}
}
/*
������˵������ģʽ�ʺϣ�
���ǳ����˴����Ĳ�Ʒ��Ҫ���������Ҿ��й�ͬ�Ľӿ�ʱ������ͨ����������ģʽ���д�����
���ϵ�������ģʽ�У���һ�����������ַ������󣬲�����ȷ��������
����������ڵڶ��֣�����Ҫʵ���������࣬
���ԣ����������£����ǻ�ѡ�õ����֡�����̬��������ģʽ��
*/