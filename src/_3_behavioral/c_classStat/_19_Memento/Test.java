package _3_behavioral.c_classStat._19_Memento;
/**
 * �������£��½�ԭʼ��ʱ��value����ʼ��Ϊegg���󾭹��޸ģ���value��ֵ��Ϊniu��
 * ������ڶ��н��лָ�״̬������ɹ��ָ��ˡ�
 * ��ʵ�Ҿ������ģʽ�С�����-�ָ���ģʽ������
 * @author Zero.Hegel
 *
 */
public class Test {
	public static void main(String[] args) {
		// ����ԭʼ��
		Original original = new Original("egg");
		
		// ��������¼
		Storage storage = new Storage(original.createMemento());
		
		// �޸�ԭʼ���״̬
		System.out.println("��ʼ״̬Ϊ��" + original.getVaule());
		original.setVaule("niu");
		System.out.println("�޸ĺ��״̬Ϊ��" + original.getVaule());
		
		// �ָ�ԭʼ���״̬
		original.restoreMemento(storage.getMemento());
		System.out.println("�ָ����״̬Ϊ��" + original.getVaule());
		/*
		��ʼ״̬Ϊ��egg
		�޸ĺ��״̬Ϊ��niu
		�ָ����״̬Ϊ��egg
		*/
	}
}
