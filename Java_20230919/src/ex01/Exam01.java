package ex01;

public class Exam01 {
	
	public static void main(String[] args) {
		int result = factorial(5);
		
		System.out.println("result :" + result);
	}

	private static int factorial(int num) {
		
		int result = 0;
		
		if(num ==1)
			result=1;
		else
			result = num *factorial(num-1);
		return result;
	}

}
