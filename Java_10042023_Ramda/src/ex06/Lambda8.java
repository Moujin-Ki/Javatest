package ex06;

@FunctionalInterface
interface exam4{
	int roll();

}


public class Lambda8 {
	public static void main(String[] args) {
		exam4 cal = 
			()-> (int)(Math.random()*6);
		

		System.out.println(cal.roll());
	}
}
