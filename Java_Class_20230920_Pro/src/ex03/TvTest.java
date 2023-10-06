package ex03;

import ex08_singleton.Singleton;

public class TvTest {

	public static void main(String[] args) {

		TV tv = new TV(10);
		
		System.out.println(tv.channel);
		
//		TV tv2 = new TV("black", false, 7);
		Singleton s2 = Singleton.getInstance();
		System.out.println(s2.apple);
	}

}
