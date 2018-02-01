package _3_behavioral.b_twoClass._16_Iterator;

public class Test {
	public static void main(String[] args) {
		Collection collection = new MyCollection();
		Iterator it = collection.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		/*
		A
		B
		C
		D
		E
		*/
	}
}
