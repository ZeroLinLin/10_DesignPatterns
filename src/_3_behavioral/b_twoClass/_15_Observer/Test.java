package _3_behavioral.b_twoClass._15_Observer;

public class Test {
	public static void main(String[] args) {
		Subject sub = new MySubject();
		sub.add(new Observer1());
		sub.add(new Observer2());
		
		sub.operation();
		/*
		update self
		observer1 has received!
		observer2 has received!
		*/
	}
}
