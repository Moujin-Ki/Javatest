package ex02;

public class Exam01 {
	
	public static void main(String[] args) {
		System.out.println(add(1,3));
		System.out.println(add(1,3,5));
		System.out.printf("%.2f\n", add(1.8,3.9,5.9));
	}

	private static int add(int i, int j, int k) {
		return i+j+k;
	}

	private static int add(int i, int j) {
		return i+j;
	}
	private static double add(double i, double j, double k) {
		return i+j+k;
	}
}
