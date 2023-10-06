package ex03;

import java.util.Scanner;
//
//
public class Exam15 {
	
	public static void main(String[] args) {
		addition(3,4);
		int result = subtraction(5,2);
		System.out.println(result);
	}
	
	public static void addition(int a, int b) {
		System.out.printf("더하기: %d\n", a+b);
	}
	
	public static int subtraction(int a, int b) {
		return (a-b);
	}
}
//더하기 : 7
//빼기:3