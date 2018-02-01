package _2_structural._10_Bridge;
/**
 * ����һ���ţ�����Sourceable��һ��ʵ��
 * @author Zero.Hegel
 *
 */
public abstract class Bridge {
	private Sourceable source;
	
	public void method() {
		source.method();
	}
	
	public Sourceable getSource() {
		return source;
	}
	public void setSource(Sourceable source) {
		this.source = source;
	}
}
