package ex06;

public class CalculatorExam {
	public static void main(String[] args) {
		Calculator cal = new Calculator();
		cal.add(10,20);
		System.out.println(cal.result);
		cal.minus = 123;
		System.out.println(cal.minus);
		
		Calculator cal2 = new Calculator();
		cal.add(100,200);
		System.out.println(cal2.result);
		cal2.minus = 321;
		System.out.println(cal2.minus);
		
		cal.sub(10, 5);
		System.out.println(cal.minus);
		
		Calculator.sub(50, 10);
		System.out.println(Calculator.minus);

	}
	
}
