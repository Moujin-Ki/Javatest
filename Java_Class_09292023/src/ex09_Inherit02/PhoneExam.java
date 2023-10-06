package ex09_Inherit02;

public class PhoneExam {
	
	public static void main(String[] args) {
		
		Phone p = new Phone("애플폰", "V11");
		
		p.bell();
		p.sendVoice("Test Message");
		p.hangUp();
		
		SmartPhone s = new SmartPhone("삼성폰", "폴더", true);
	}

}
