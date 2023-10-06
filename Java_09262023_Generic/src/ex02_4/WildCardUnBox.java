package ex02_4;

class Box<T>{
	private T ob;
	
	public void set(T ob) {
		this.ob = ob;
	}
	public T get() { return this.ob; }
	
	@Override
	public String toString() { return ob.toString();}
}

class Toy{
	
	public String toString() {	return "I am a Toy";}
}
	
class BoxHandler{   
	public static void outBox(Box<? extends Toy> box) { //꺼내기, get만 가능
		Toy t = box.get();
		System.out.println(t);
//		Toy n2 = box.set();
	}
	public static void inbox(Box<? super Toy> box, Toy n) { //저장하기, set만 가능
		box.set(n);
//		Toy n2 = box.get(); 이 기능도 동일하게 의도 하지 않은 동작을 추가 할 수 있다.
	}
}

public class WildCardUnBox {
	public static void main(String[] args) {
		Box<Toy> box = new Box(); // 1. Class Box의 setBox를 호출해서 Empte Box를 만들고 <Toy> 타입의 데이터만 받도록 실행
		BoxHandler.inbox(box, new Toy());
		BoxHandler.outBox(box);
	
	}
}

