package ex01;

import java.util.Scanner;

public class Hello {
	
	
	
	public static void main(String[] args ) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수 입력 >> ");
		
		int number = sc.nextInt();
		
		int hour = number/3600;
		int min = number/60%60;
		int sec = number%60;
		
		//출력은..
		System.out.printf("%d시간 %d분 %d초\n", hour, min, sec);

	}

}
