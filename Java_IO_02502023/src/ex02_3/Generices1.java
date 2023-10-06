package ex02_3;

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
class Box<T extends Number>{ // Number 이거나 Number를 상속한 클래스만 전달해라.
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
		
		Box<Double> aBox = new Box();
		
	}
}
