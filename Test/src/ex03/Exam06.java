package ex03;

import java.util.Scanner;

public class Exam06 {
	
	public static void main(String[] args) {
		int sum = 0;
		int i = 0;
		
		do {
			i++;
			sum +=i;
		}while(i<10);
		
		System.out.println("sum : " + sum);
	}
}
