package ex03;

public class TvTest {
	
	public static void main(String[] args) {
		
		TV tv = new TV(); //객체생성, 생성자호출	
		// 객체가 생성 되기 위해서는 반드시 생성자를 통해서 생성 된다.
		// 생성자를 만들지 않으면 JVM이 자동으로 만든다 "TV(){}"
		// 생성자를 직접 만들면 JVM은 기본생성자를 만들어 주지 않는다.
		// 생성자는 오버로딩이 가능
		TV tv2 = new TV(10);
		
		TV tv3 = new TV("kor", 10);
		
	}

}
