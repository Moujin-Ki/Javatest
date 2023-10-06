import lombok.Data;


public class ex01 {
	
	public static void main(String[] args) {
		Person p1 = new Person("김용우", 20);
		Person p2 = new Person("김용우", 20);
	
		System.out.println(p1.equals(p2));
		
	}
	
}


class Person{
	String name;
	int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}	
	@Override
	public boolean equals(Object obj) { // Object 가 받을 수 없는 Class를 받아 줘서
		Person p2 = (Person)obj; // 받은 Class를 Downsizing을 해서 사용 할 수 있도록 해준다.
		return this.name.equals(p2.name) && this.age == p2.age;
	}
	
	
}
