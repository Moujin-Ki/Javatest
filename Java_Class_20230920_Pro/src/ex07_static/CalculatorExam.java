package ex07_static;

public class CalculatorExam {

	public static void main(String[] args) {
		
		Calculator c =  new  Calculator();
		System.out.println(c.result);
		c.add(1, 1);
		
		
		System.out.println("--------------------");
		
		System.out.println(Calculator.minus);
		// System.out.println(c.minus); X
		Calculator.sub(0, 0);
	}

}
