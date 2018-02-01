package _3_behavioral.c_classStat._20_State;
/**
 * 状态模式核心类
 * @author Zero.Hegel
 *
 */
public class State {
	
	private String value;
	
	public void method1() {
		System.out.println("execute the first opt!");
	}
	
	public void method2() {
		System.out.println("execute the second opt!");
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
	
}
