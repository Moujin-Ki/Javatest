package ex08;

public class Singleton {
	static Singleton singlton = new Singleton();
	int apple = 100;
	private Singleton() {
	}
	public static Singleton getInstance(){
		return singlton;
	
	}
	
}
