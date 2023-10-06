package Homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Student {
	private String name;
	private String subject;
	private int age, kor, eng, math, sum;
	
	
	
	public int sum() {
		return kor+eng+math;
	}
	
	
	
	
	
	public static void main(String[] args) {
		String[] students = {"S1", "S2", "S3"};
		
		for (int i = 0; i < students.length; i++) {
		    System.out.println(students[i]);
		}
		Scanner sc = new Scanner(System.in);
		int kor = sc.nextInt();
	}
}
