package ex01;

class Outer{
	private static int num = 0;
	
	static class Nested1{ 
		void add(int n) {num += n;}
		
	}
	static class Nested2{ 
		int get() { return num;}
		
	}
}

public class StaticNestedClass {

	public static void main(String[] args) {

	}

}
