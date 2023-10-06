package ex09_Inherit;

public class Example01 {
	public static void main(String[] args) {
		BabyCat catObj = new BabyCat("샴고양이", "검정");
		
		catObj.eat();
		catObj.meow();
		System.out.println(catObj.breed);
	}
}
