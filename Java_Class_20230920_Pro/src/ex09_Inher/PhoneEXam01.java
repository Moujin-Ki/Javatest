package ex09_Inher;

public class PhoneEXam01 {

	public static void main(String[] args) {
		
		Phone p = new Phone("애플폰", "V11");
		
		p.bell();
		p.sendVoice("놀자........");
		p.hangUp();
//		
		SmartPhone s = new SmartPhone("삼성폰", "검정", true);
		System.out.println(s.color);
		System.out.println(s.model);
		System.out.println(s.wifi);
		
		SmartPhone s2 = new SmartPhone();
		
		
		
		
		
		
		
		
		
		
		
	}

}
