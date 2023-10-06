package ex04;

public class MainClass {

	public static void main(String[] args) {
		A a = new A();
		a.funcA();
		
		B b = new B();
		b.funcB();
		b.funcA();
//		b.funcC();(X)
		
		C c = new C();
		c.funcA();
		c.funcB();
		c.funcC();
		
		A aa = new B();
		aa.funcA(); // Class A의 메서드가 출력
		//B 클래스가 A클래스에 있는 functionA 메소드를 재정의 하느면 그 때는 B클래스 안 funcA가 실행 됨.
		
		
//		B bb = aa;
		B bb = (B)aa;
		
		A a3 = new C();
		B b3 = (B)a3;
		C c3 = (C)a3;
	}

}
