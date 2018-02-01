package _3_behavioral.a_fatherAndSon._13_Strategy;

public class Plus extends AbstractCalculator implements ICalculator {

	@Override
	public int calculate(String exp) {
		int arrayInt[] = split(exp,"\\+");  
		return arrayInt[0]+arrayInt[1];  
	}

}
