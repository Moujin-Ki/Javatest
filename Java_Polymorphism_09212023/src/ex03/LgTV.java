package ex03;

abstract public class LgTV extends TV{
	public void powerOn() {
		System.out.println("LgTV.. 전원 키다.");
	}
	
	public void powerOff() {
		System.out.println("LgTV.. 전원 끄다.");
	}
	
//	public void volumeUp() {
//		System.out.println("LgTV.. 소리 올리다.");
//	}
	
	public void volumeDown() {
		System.out.println("LgTV.. 소리 내리다..");
	}
}
