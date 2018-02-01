package _3_behavioral.d_middleClass._22_Mediator;

public class Test {
	public static void main(String[] args) {
		Mediator mediator = new MyMediator();
		mediator.createMediator();
		mediator.workAll();
		/*
		user1 exe!
		user2 exe!
		*/
	}
}
