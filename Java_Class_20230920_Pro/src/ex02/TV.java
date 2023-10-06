package ex02;

public class TV {
	
	String color;
	boolean power;
	int channel;
	
	TV(){
		System.out.println("기본생성자");
	}

	TV(int n){
		channel = n;
		System.out.println("1개 변수");
	}

	TV(String s, int n){
		color = s;  channel = n;
		System.out.println("2개 변수");
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
