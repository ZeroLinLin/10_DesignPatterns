package _2_structural._09_Facade;

public class User {
	public static void main(String[] args) {
		Computer computer = new Computer();
		computer.startup();
		computer.shutdown();
		/*
		start the computer!
		cpu startup!
		memory startup!
		disk startup!
		start computer finished!
		begin to close the computer!
		cpu shutdown!
		memory shutdown!
		disk shutdown!
		computer closed!
		*/
	}
}
