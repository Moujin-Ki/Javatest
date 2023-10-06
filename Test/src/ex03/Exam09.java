package ex03;

import java.util.Scanner;
//두정수 합을 구하는 함수
//반환타입 있고, 매개변수 있는 유형
public class Exam09 {
	
	public static void main(String[] args) {
		int sum = add(10,20);
		System.out.println("sum : " + sum);
	}
	
	//            반환타입 함수명(매개변수)
	public static int add(int n1, int n2) {
		return n1+n2;
	}
}
