package _3_behavioral.d_middleClass._22_Mediator;

public abstract class User {
	
	private Mediator mediator;
	
	public User(Mediator mediator) {
		super();
		this.mediator = mediator;
	}
	/**
	 * User¹¤×÷
	 */
	public abstract void work();

	public Mediator getMediator() {
		return mediator;
	}

	public void setMediator(Mediator mediator) {
		this.mediator = mediator;
	}
	
}
