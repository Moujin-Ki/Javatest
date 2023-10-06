package ex08;

import java.util.Scanner;

public class Exam02 {
	
	public static void main(String[] args) {
		double[][] marks = new double[2][3];
		Scanner s = new Scanner(System.in);
		
		for (int i = 0; i < 2; i++) {
			System.out.println("Snum : " + (i +1));
			System.out.println("KorS : ");
			marks[i][0] = s.nextDouble();
			
			System.out.println("MathS : ");
			marks[i][1] = s.nextDouble();
			
			marks[i][2] = (marks[i][0] + marks[i][1])/2;
		}
		
		for (int i = 0; i<2; i++) {
			System.out.println("Snum" + (i +1));
			System.out.println("Kor" + ":" + marks[i][0] + " ");
			System.out.println("Math" + ":" + marks[i][1] + " ");
			System.out.println("Avg" + ":" + marks[i][2] + " ");
		}
	}
	
}
