package ex02;

import java.util.ArrayList;
import java.util.List;

class Student{
	private String name;
	private int java;
	public Student(String name, int java) {
		this.name = name;
		this.java = java;
	}
	public int getJava() {
		return java;
	}
	
}

public class StudentStream {

	public static void main(String[] args) {
		
		
		List<Student> students = new ArrayList<Student>();
		students.add(new Student("JoJO",92));
		students.add(new Student("Ube",77));
		students.add(new Student("Son",91));
		
		double avg = students.stream()
				.mapToInt(s->s.getJava())
				.average()
				.getAsDouble();
		System.out.printf("Avg : %.2f\n", avg);
		
		System.out.println("------------------");
		
		OptionalDouble average = studetns.stream()
				.mapToin
	}

}
