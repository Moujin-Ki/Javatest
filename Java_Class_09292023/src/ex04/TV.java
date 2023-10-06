package ex04;

public class TV {

	String color;
	boolean power;
	int channel;
	
	TV(){ 
		System.out.println("기본생성자");
		this.channel = 11;
		this.color = "white";
		this.power = false;
	}
	TV(int channel){ // 생성자는 반환 타입이 없다.
		this.channel = channel;
		this.color = "white";
		this.power = false;
	}
	TV(String color){ 
		this.color = color;
		this.channel = 11;
		this.power = false;
	}
	
	TV(String color, boolean power, int channel){
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
