package ex08_singleton;

public class Singleton {
	
	public static Singleton singlton = new Singleton();
	
	public int apple=100;
		
	private Singleton() {
		
	}
	
	public static Singleton getInstance() {
		return singlton;
	}
	
}
