package _2_structural._07_Decorator;

public class Test {
	public static void main(String[] args) {
		Sourceable source = new Source();
		Sourceable obj = new Decorator(source);
		obj.method();
		/*
		before decorate
		the original method!
		after decorate
		*/
	}
}
