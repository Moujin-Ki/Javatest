package ex02_3;

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
	
class BoxHandler{   // 상/하한 제한 : 설정한 메소드가 의도 하지 않은 동작을 하면서 코드기 실행 될 수 있음. 이 오류를 방지 하기 위해 상/하한 제한을 설정 함. 아래의 예제는 꺼내기는 꺼내기만, 
//	저장하기는 저장 하기만 하도록 변경 해야 함.
	public static void outBox(Box<Toy> box) { //꺼내기
		Toy t = box.get();
		System.out.println(t);
//		box.set(new Toy());  저장 되는 기능을 추가 할 수 있다. 의도 하지 않은 동작을 실행하게 된다.
	}
	public static void inbox(Box<Toy> box, Toy n) { //저장하기
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

