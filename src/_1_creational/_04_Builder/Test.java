package _1_creational._04_Builder;

public class Test {
	public static void main(String[] args) {
		Builder builder = new Builder();
		builder.produceMailSender(10);
	}
}
/*
����㿴����������ģʽ���ܶ๦�ܼ��ɵ�һ������������Դ�����Ƚϸ��ӵĶ�����
�����빤��ģʽ��������ǣ�����ģʽ��ע���Ǵ���������Ʒ��
��������ģʽ���ע�������϶��󣬶�����֡�
��ˣ���ѡ�񹤳�ģʽ���ǽ�����ģʽ����ʵ�����������
*/