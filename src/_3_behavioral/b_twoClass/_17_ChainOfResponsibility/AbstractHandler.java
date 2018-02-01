package _3_behavioral.b_twoClass._17_ChainOfResponsibility;

public abstract class AbstractHandler {
	
	private Handler handler;
	
	public Handler getHandler() {
		return handler;
	}
	
	public void SetHandler(Handler handler) {
		this.handler = handler;
	}
}
