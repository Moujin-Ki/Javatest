

package ex01;

public class TvTest {
	
	public static void main(String[] args) {
		
		
		TV tv = new TV();	
		
		tv.channel=7;
		tv.channelDown();
		
		System.out.println(tv.channel);
		
		TV tv2 = new TV();
		System.out.println(tv2.channel);
		
		TV tv3;
		tv3 = new TV();
		System.out.println(tv3.channel);
		
		tv3.channel = 100;
		
		System.out.println(tv.channel);
		System.out.println(tv3.channel);

	}

}
