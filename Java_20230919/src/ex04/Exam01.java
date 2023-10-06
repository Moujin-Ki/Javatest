package ex04;

import java.util.Scanner;

public class Exam01 {

	public static void main(String[] args) {
		
		int[] score = new int[5];
		int sum = 0;
		
		for(int i=0; i<score.length; i++) {
			score[i] = (int)(Math.random()*100)+1;
			System.out.println(score[i]);
		}
		
		for(int i=0; i<score.length; i++) {
			sum = sum + score[i];
		}
		System.out.println(sum);
		System.out.println((double)(sum/score.length));
		System.out.println("-------------------------------------------");
		
		int max = score[0];
		int min = score[0];
		
		for(int i=1; i<score.length; i++) {
			if(score[i]>max) {
				max = score[i];
				
			}else if(score[i]<min) {
				min = score[i];
			}
		}
		System.out.println(max + "," + min);
		
		System.out.println("-------------------------------------------");
		for(int i=1; i<score.length; i++) {
			boolean flag = false;
			for(int j=0; j<score.length-1; j++) {
				if(score[j]>score[j+1]) {
					int temp = score[j];
					score[j]=score[j+1];
					score[j+1]=temp;
								
			}
			
		} if(!flag) break;
		}
		for(int i=1; i<score.length; i++) {
			System.out.println(score[i]);
		}
		
	}
	
}
