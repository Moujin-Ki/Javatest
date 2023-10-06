package ex03;

import java.util.ArrayList;

import java.util.List;
import java.util.Scanner;

public class Exam13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int blance=0;
		boolean flag = true;
		
		while(flag) {
		
			System.out.println("---------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("---------------------------");
			System.out.print("선택>");
			int input = sc.nextInt();
			
			switch(input) {
			case 1:
				System.out.println("예금액>");
				blance += sc.nextInt();
				break;
			case 2:
				System.out.println("출금액>");
				blance -= sc.nextInt();
				break;
			case 3:
				System.out.println("잔고>"+blance);
				break;
			case 4:
				System.out.println("프로그램종료");
				flag=false;
				break;
			}
		}
		
	}
}

