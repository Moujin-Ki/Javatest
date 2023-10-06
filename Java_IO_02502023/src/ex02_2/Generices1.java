package ex02_2;

class Apple{
	public String toString() {
		return "I am an apple";
	}
	
}

class Orange{
	public String toString() {
		return "I am an Oranage";
	}
	
}
//Generic class
class Box<T>{ 
	private T obj;
	
	void setObj(T obj) {
		this.obj = obj;
	}
	
	T getObj(){
		return obj;
	}
}

public class Generices1 {
	public static void main(String[] args) {
		
		Box<Apple> aBox = new Box<Apple>(); //<> 안의 내용이 "class Box<T>{ "의 T를 대체하게 된다.
		aBox.setObj(new Apple()); // 이미 새로운 값으로 변경 되었기 때문에 형변환이 필요하지 않다.
//		aBox.setObj(new Orange()); 이미 지정 된 내용이 있어 새로운 내용을 넣을 수 없다.
		
		Box<Orange> oBox = new Box<Orange>();
		oBox.setObj(new Orange());
		
		Orange or = oBox.getObj();
		System.out.println(or);
		
		
//		Box aBox = new Box();
//		aBox.setObj(new Apple());
//		System.out.println(aBox.getObj());
//		aBox.setObj(new Orange());
//		System.out.println(aBox.getObj());
		
	}
}
