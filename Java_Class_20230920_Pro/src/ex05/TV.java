package ex05;

public class TV {
	
	String color;
	boolean power;
	int channel;
	
	//생성자는 역활 : 멤버변수 초기화 이용될 수 있다.
	TV(){
		this("white",11,false);  //생성자호출
		System.out.println("기본생성자");
	}

	TV(int channel){
		this("white",channel,false);
	}
	
	TV(String color){
		this(color, 11, false);
		
	}

	TV(String color, int channel, boolean power){
		this.color = color;
		this.power = power;
		this.channel = channel>100? 100 : channel;
	}
	
	void power() {
		power = !power;
	}
	
	void channelUp() {
		channel++;
	}
	

	void channelDown(int n) {
		channel--;
	}
	
	{
		channelUp();
		channelDown(10);
	}
}
