package ex09_Inher;

public class SmartPhone extends Phone{
	
	public boolean wifi;
	
	public SmartPhone() {
		
	}
	
	public SmartPhone(String model, String color, boolean wifi) {
		super(model, color); //상위 클래스 생성자 호출
		this.wifi = wifi;
	}
	
	public void setWifi(boolean wifi) {
		this.wifi = wifi;
	}
	
	public void youTube() {
		System.out.println("유튜브 접속한다..");
	}
}
