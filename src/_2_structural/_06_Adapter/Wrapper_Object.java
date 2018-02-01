package _2_structural._06_Adapter;
/**
 * _06_Adapter_02 适配器模式 之 “对象的适配器模式”
 * 
 * Adapter实现Targetable接口，持有Source的对象
 * 这样Targetable接口的实现类就具有了Source类的功能
 * @author Zero.Hegel
 *
 */
public class Wrapper_Object implements Targetable {
	private Source source;
	
	public Wrapper_Object(Source source) {
		super();
		this.source = source;
	}
	
	@Override
	public void method2() {
		System.out.println("this is the targetable method2!");
	}

	@Override
	public void method1() {
		// 调用Source对象的方法
		source.method1();
	}

}
