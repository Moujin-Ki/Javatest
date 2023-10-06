package ex03;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionsEx01 {
	
	public static void main(String[] args) {
		System.out.println("에외처리01");
		System.out.println("에외처리02");
		System.out.println("에외처리03");
		System.out.println("에외처리04");
		Scanner sc = new Scanner(System.in);
		System.out.print(">> 정수입력");
		try {
		
		int num = sc.nextInt();
		System.out.println(5/num);
		
		}catch(Exception e) {
			System.out.println(e.getMessage());
		
		}finally { // Optional 써도 되고 아니어도 된다.
			System.out.println("예외처리 종료!!");
		}
		
		System.out.println("에외처리05");
		System.out.println("에외처리06");
		System.out.println("에외처리07");
		System.out.println("에외처리08");
		System.out.println("프로그램 종료!!");
	}

}
