package ex06;

@FunctionalInterface
interface exam3{
	int square(int x);

}


public class Lambda7 {
	public static void main(String[] args) {
		exam3 cal = 
			x->  x * x;
	

		System.out.println(cal.square(5));
	}
}
