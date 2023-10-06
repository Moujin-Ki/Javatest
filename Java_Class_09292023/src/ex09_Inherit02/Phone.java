package ex09_Inherit02;

public class Phone {
	String model;
	String color;
	
//	public Phone() {}
	public Phone(String model, String color) {
		this.model = model;
		this.color = color;
	}
	
	public void bell() {
		System.out.println("전환 벨이 울립니다.");
	}
	
	public void sendVoice(String message) {
		System.out.println("음성 메시지를 보낸니다 : " + message);
	}
	
	public void hangUp() {
		System.out.println("전화를 끊습니다.");
	}
}
