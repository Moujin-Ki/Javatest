package ex01_3;

class Box<T>{
	private T ob;
	
	public Box(T ob) { // 1번. 먼저 super(ob)를 받아줄 메서드를 만든다.
		this.ob = ob;
	}
	public void set(T ob) {
		this.ob = ob;
	}
	public T get() { return this.ob; }
}

class SteelBox<T> extends Box<T>{
	public SteelBox(T ob) { // "(T ob)" 의 값을 class Box<T>의 set(T ob)로 전달해라
		super(ob); // 2 번. 상위 메서드에 전달하기 위해 super 메서드를 사용한다.
	}
}



public class GenericMethdExam {
	public static void main(String[] args) {
		Box<Integer> iBox = new SteelBox(new Integer(999));
		Box<Integer> sBox = new SteelBox(new String("Sweet"));
		
		System.out.println("IBox : " + iBox.get() + "\n" + "SBox : " + sBox.get());
	}
}
	    