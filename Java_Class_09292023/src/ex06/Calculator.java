package ex06;

public class Calculator {
	
	int result;//인스턴스 변수
	static int minus;//정적변수, 클래스 변수
	
	//인스턴트 매소드
	void add(int num1, int num2) {
		this.result = num1+num2;
//		result = num1+num2;
	}
	//정적 또는 클래스 매소드
	static void sub(int num1, int num2) {
		minus = num1 - num2;
//		(Error)this.minus = num1 - num2;
	}
}
