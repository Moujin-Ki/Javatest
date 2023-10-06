package ex03;

public class TV {

	String color;
	boolean power;
	int channel;
	
	TV(){ // 생성자는 반환 타입이 없다.
		System.out.println("기본생성자");
	}
	TV(int n){ // 생성자는 반환 타입이 없다.
		System.out.println("1개변수");
	}
	TV(String s , int n){ 
		System.out.println("2개변수");
	}
	
	void power() {
		power = !power;
	}
	
	void channelUP() {
		channel++;
	}
	
	void channelDown() {
		channel--;
	}
}
