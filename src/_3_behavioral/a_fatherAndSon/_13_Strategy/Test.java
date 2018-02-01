package _3_behavioral.a_fatherAndSon._13_Strategy;

public class Test {
	public static void main(String[] args) {
		String exp = "2+8";
		ICalculator cal = new Plus();
		int result = cal.calculate(exp);
		System.out.println(result);
		//10
	}
}
