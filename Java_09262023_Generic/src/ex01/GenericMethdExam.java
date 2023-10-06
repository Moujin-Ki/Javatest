package ex01;

class Box<T>{
	private T ob;
	public void set(T ob) {
		this.ob = ob;
	}
	public T get() { return this.ob; }
}

class BoxFactory{
	public static <T> Box<T> makeBox(T o){
		Box<T> box = new Box<T>();
		box.set(o);
		return box;
	}
}

public class GenericMethdExam {
	public static void main(String[] args) {
		Box<String> sBox = BoxFactory.makeBox("Sweet");
		System.out.println(sBox.get());
		
		Box<Double> dBox = BoxFactory.makeBox(7.59);
		System.out.println(dBox.get());
	}

}
