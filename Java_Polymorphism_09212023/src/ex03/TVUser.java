package ex03;

public class TVUser {
	public static void main(String[] args) {
		TV tv = new LGTVSub();
		tv.powerOn();
		tv.volumeUp();
		tv.volumeDown();
		tv.powerOff();
	}
}
