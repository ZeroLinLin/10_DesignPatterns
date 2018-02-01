package _3_behavioral.b_twoClass._18_Command;

public class Invoker {
	
	private Command command;

	public Invoker(Command command) {
		super();
		this.command = command;
	}
	
	public void action() {
		command.exe();
	}
}
