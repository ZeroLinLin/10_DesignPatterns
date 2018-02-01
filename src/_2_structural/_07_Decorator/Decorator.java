package _2_structural._07_Decorator;

public class Decorator implements Sourceable {

	private Sourceable source;
	
	public Decorator(Sourceable source) {
		super();
		this.source = source;
	}

	@Override
	public void method() {
		System.out.println("before decorate");
		source.method();
		System.out.println("after decorate");
	}

}
