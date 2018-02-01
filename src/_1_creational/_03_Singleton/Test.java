package _1_creational._03_Singleton;

public class Test {
	public static void main(String[] args) {
		
		//Singleton_5_Enum.INSTANCE.method();
		
		for(int i=0; i<50; i++) {
			new Thread() {
				@Override
				public void run() {
					System.out.println(Singleton_7_StaticCodeSeg.getInstance());
				}
			}.start();
		}
	}
}
