package _3_behavioral.d_middleClass._22_Mediator;

public interface Mediator {
	/**
	 * 创建中介者，初始化多个用户，并利用用户的有参构造，并指定它们使用该中介者
	 */
	public void createMediator();
	/**
	 * 中介工作
	 */
	public void workAll();
}
