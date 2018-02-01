package _3_behavioral.b_twoClass._18_Command;

public class MyCommand implements Command {
	
	private Receiver receiver;
	
	public MyCommand(Receiver receiver) {
		super();
		this.receiver = receiver;
	}

	@Override
	public void exe() {
		receiver.action();
	}

}
