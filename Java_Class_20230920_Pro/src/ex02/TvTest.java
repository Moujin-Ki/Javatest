package ex02;


public class TvTest {

	public static void main(String[] args) {

		TV tv = new TV(); //객체생성, 생성자호출
		//객체가 생성되기 위해서는 반드시 생성자를 통해서 
		//생성된다.. 
		//생성자는 오버로딩이 가능
		
		TV tv2 = new TV(10);
		
		TV tv3 = new TV("kor", 10);
	}

}
