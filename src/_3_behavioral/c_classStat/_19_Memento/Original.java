package _3_behavioral.c_classStat._19_Memento;

public class Original {
	
	private String vaule;

	public Original(String vaule) {
		super();
		this.vaule = vaule;
	}
	
	/**
	 * ��������¼
	 * @return
	 */
	public Memento createMemento() {
		return new Memento(vaule);
	}
	
	/**
	 * �ӱ���¼�ָ�����
	 * @param memento
	 */
	public void restoreMemento(Memento memento) {
		this.vaule = memento.getValue();
	}
	
	public String getVaule() {
		return vaule;
	}

	public void setVaule(String vaule) {
		this.vaule = vaule;
	}
	
}
