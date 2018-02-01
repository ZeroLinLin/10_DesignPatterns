package _3_behavioral.b_twoClass._17_ChainOfResponsibility;

public class MyHandler extends AbstractHandler implements Handler {
	
	private String name;
	
	public MyHandler(String name) {
		super();
		this.name = name;
	}

	@Override
	public void operator() {
		System.out.println(name + "deal!");
		if(getHandler() != null) {
			getHandler().operator();
		}
	}

}
