package ex06_interface;

public class LPrinter implements Soundable {

	@Override
	public void sound() {
		System.out.println("야옹");
		System.out.println("soundable");
	}
	
}
