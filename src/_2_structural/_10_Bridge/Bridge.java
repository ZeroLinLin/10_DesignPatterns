package _2_structural._10_Bridge;
/**
 * 定义一个桥，持有Sourceable的一个实例
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
