package ex03;

import java.util.Scanner;

public class Exam03 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("A 입력 >> ");
		int A = sc.nextInt();
		System.out.println("B 입력 >> ");
		int B = sc.nextInt();
		System.out.println("C 입력 >> ");
		int C = sc.nextInt();
		int max = 0;
		if (A >= B) {
			if(A > C) {
				max = A;
			}else {
				max = C;
			}
		}else {
			if(B>C) {
				max = B;
				
			}else {
				max =C;
			}
		}
		System.out.printf("max : %d", max);
	}
}
