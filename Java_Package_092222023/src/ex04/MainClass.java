package ex04;

import java.util.Iterator;

public class MainClass {

	
	public static void main(String[] args) {
		Student[] students = new Student[3];
		int total = 0;
		double average = 0;
		students[0] = new Student("S1", 20,80,55,66);
		students[1] = new Student("S2", 20,40,80,66);
		students[2] = new Student("S3", 20,68,55,99);
		
		System.out.println("성명 나이 국어 영어 수학 총점 평균");
		for(Student s : students) {
			System.out.printf("%-5s %3d %3d %3d %3d %3d %5.2f\n",
					s.getName(), s.getAge(),s.getKor(), s.getEng(), s.getMath(), s.getSum(), s.getAvg());
			total += s.sum();
		}
		
		
		
//		for(int i=0; i<students.length; i++) {
//			System.out.println(students[i]);
//			total += students[i].sum();
//		}
		average = (double)total/students.length;
		System.out.println(total + average);
	}
}
