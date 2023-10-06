package ex01_1;

class Box<T>{
	private T ob;
	public void set(T ob) {
		this.ob = ob;
	}
	public T get() { return this.ob; }
}

class Unboxer{
	public static <T> T openBox(Box<T> box){
		return box.get();
	}
}

public class GenericMethdExam {
	public static void main(String[] args) {
		
		Box<String> box = new Box<String>();  
	    box.set("Sweet");
	    
	    String str = Unboxer.openBox(box);
	    System.out.println(str);
//		Result = T : String : Sweet
		
//		Box<String> sBox = BoxFactory.makeBox("Sweet");
//		System.out.println(sBox.get());
//		
//		Box<Double> dBox = BoxFactory.makeBox(7.59);
//		System.out.println(dBox.get());
	}

}
