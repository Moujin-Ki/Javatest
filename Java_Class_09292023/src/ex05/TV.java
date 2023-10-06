package ex05;

public class TV {

	String color;
	boolean power;
	int channel;
	
	TV(){ 
		this("white",11,false);
		System.out.println("기본생성자");
	}
	TV(int channel){ // 생성자는 반환 타입이 없다.
		this("white",channel,false);
	}
	TV(String color){ 
		this("white",11,false);
	}
	
	TV(String color, int channel, boolean power){
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
