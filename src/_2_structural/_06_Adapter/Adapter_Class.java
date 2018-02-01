package _2_structural._06_Adapter;
/**
 * _06_Adapter_01 适配器模式 之 “类的适配器模式”
 * 
 * Adapter类继承Source类，实现Targetable接口
 * 这样Targetable接口的实现类就具有了Source类的功能
 * @author Zero.Hegel
 *
 */
public class Adapter_Class extends Source implements Targetable {

	@Override
	public void method2() {
		System.out.println("this is the targetable method2!");
	}

}
