package _1_creational._05_Prototype;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * _05_Prototype ԭ��ģʽ��Prototype��
 * 
 * ԭ��ģʽ��Ȼ�Ǵ����͵�ģʽ�������빤��ģʽû�й�ϵ�������ּ��ɿ�����
 * ��ģʽ��˼����ǽ�һ��������Ϊԭ�ͣ�������и��ơ���¡������һ����ԭ�������Ƶ��¶���
 * @author Zero.Hegel
 *
 */
public class Prototype_1_ShallowClone implements Cloneable {
	// ǳ����
	public Object clone() throws CloneNotSupportedException {
		Prototype_1_ShallowClone proto = (Prototype_1_ShallowClone) super.clone();
		return proto;
	}
	
	/*
	  �ܼ򵥣�һ��ԭ���ֻ࣬��Ҫʵ��Cloneable�ӿڣ���дclone�������˴�clone�������Ըĳ���������ƣ�
	 ��ΪCloneable�ӿ��Ǹ��սӿڣ���������ⶨ��ʵ����ķ���������cloneA����cloneB��
	 ��Ϊ�˴����ص���super.clone()��仰��super.clone()���õ���Object��clone()����������Object���У�
	 clone()��native�ģ�������ôʵ�֣��һ�����һƪ�����У����ڽ��Java�б��ط����ĵ��ã��˴��������
	 ��������ҽ���϶����ǳ���ƺ������˵һ�£�������Ҫ�˽�����ǳ���Ƶĸ��

	ǳ���ƣ���һ�������ƺ󣬻����������͵ı����������´��������������ͣ�ָ��Ļ���ԭ������ָ��ġ�
	
	��ƣ���һ�������ƺ󣬲����ǻ����������ͻ����������ͣ��������´����ġ�����˵��������ƽ�������ȫ���׵ĸ��ƣ���ǳ���Ʋ����ס�
	 */
	
}
