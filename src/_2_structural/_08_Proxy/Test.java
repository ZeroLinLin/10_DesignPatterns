package _2_structural._08_Proxy;

public class Test {
	public static void main(String[] args) {
		Sourceable source = new Proxy();
		source.method();
		/*
		before proxy
		the original method!
		after proxy
		*/
	}
}
