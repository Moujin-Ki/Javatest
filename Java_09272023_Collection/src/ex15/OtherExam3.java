package ex15;

import java.util.Arrays;

import lombok.AllArgsConstructor;

@AllArgsConstructor
class Person implements Comparable{
	private String name;
	private int age;
	
	@Override
	public String toString() {
		return name + "(" + age + ")";
	}
	
	@Override
	public int compareTo(Object o) {
		Person p = (Person)o;
		
//		if(this.age > p.age)
//			return 1;
//		else if( this.age < p.age)
//			return -1;
//		else
//			return 0;
//ej vk		return this.age - p.age; // 오름차순
		return p.age - this.age; // 내림차순
	}
	
}

public class OtherExam3 {
	
	public static void main(String[] args) {
		Person[] persons = {new Person("조조", 50), new Person("유비", 30), new Person("관우", 35)};
		
		Arrays.sort(persons);
		for(Person p : persons)
			System.out.println(p);
		
	}

}
