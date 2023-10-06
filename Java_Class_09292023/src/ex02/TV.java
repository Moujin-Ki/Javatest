package ex02;

public class TV {

	String color;
	boolean power;
	int channel;
	//생성자 역할: 맴버변수 초기화에 이용 된다.
	TV(){ 
		System.out.println("기본생성자");
	}
	TV(int channel){ 
		channel = channel;
	}
	TV(String scolor ,boolean power, int n){ 
		this.color = color;
		this.power = power;
		this.channel = channel;
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
