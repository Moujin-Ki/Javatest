package ex02_6;


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
	
class BoxContentMover{   
	public static void moveBox(Box<? super Toy> to, Box<? extends Toy> from) { 
		to.set(from.get());	
//		from.get(to.get());
	}
}



public class WildCardUnBox {
	public static void main(String[] args) {
		Box<Toy> box1 = new Box<>(); // 1. Class Box의 setBox를 호출해서 Empte Box를 만들고 <Toy> 타입의 데이터만 받도록 실행
		box1.set(new Toy()); // 
//		System.out.println(box1.get());
		Box<Toy> box2 = new Box<>();
		
		//box1에 저장 된 내용을 box2로 이동
		BoxContentMover.moveBox(box2, box1);
		System.out.println(box2.get());
	
	}
}

