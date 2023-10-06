package ex01_2;

class Box<T>{
	private T ob;
	public void set(T ob) {
		this.ob = ob;
	}
	public T get() { return this.ob; }
}

class BoxFactory{
	public static <T extends Number> Box<T> makeBox(T o){ // "(T o)" 정수, 실수, 문자열 어떤 것이든 들어 올 수 있다
//		"<T extends Number>" 는 입력 값을 숫자로만 받겠다는 제한을 설정한 명령. 따라서 "o.intValue()" 에서 발생한 에러를 수정 할 수 있다.
		Box<T> box = new Box<T>();
		box.set(o);
		
		System.out.println("Boxed data : " + o.intValue()); // "intValue()" 정수로 변환 시키기 위한 명령. "(T o)"가 숫자인지 알 수 없기 때문에 에러 발생
		return box;
	}
}

class Unboxer{
	public static <T extends Number> T openBox(Box<T> box){
		System.out.println("unBoxed data : " + box.get().intValue());
		return box.get();
	}
}

public class GenericMethdExam {
	public static void main(String[] args) {
		
//		Box<Integer> sBox = BoxFactory.<Integer>makeBox(new Integer(8989)); 일반적으로 "<Integer>"는 생략한다. 하지만 사용해도 문제없다
		Box<Integer> sBox = BoxFactory.makeBox((int) 99.99);
//		int n = Unboxer.openBox(sBox);
//		System.out.println(n);
		System.out.println(Unboxer.openBox(sBox));
	}
}
	    