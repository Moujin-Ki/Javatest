package ex03;

import java.util.Scanner;

public class Exam07 {
	
	public static void main(String[] args) {
		int sum = 0;
		int i = 10;
		
		while(i<10) {
			i++;
			if(i%2 ==0)
			
			if(i%2 ==1)
				continue;
			
			if(sum<20)
				break;
			
			sum +=i;
		}
		
		System.out.println("sum : " + sum);
		
	}
}
