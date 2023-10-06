package ex04;

public class TvTest {
	
	public static void main(String[] args) {
		
		TV tv = new TV();
		TV tv2 = new TV("Black");
		TV tv3 = new TV(10);
		
		System.out.println(tv.channel);
		
		TV tv4 = new TV("black", false, 7);
	}

}
