package ex02_1;

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
class Box{ //사과 담는 박스
	private Object obj;
	
	void setObj(Object obj) {
		this.obj = obj;
	}
	
	Object getObj(){
		return obj;
	}
	
}

public class Generices1 {
	public static void main(String[] args) {
		Box aBox = new Box();
		Box oBox = new Box();
		
		aBox.setObj(new Apple());
		oBox.setObj(new Orange());
		
		Object o1 = aBox.getObj(); 
		Apple a1 = (Apple)aBox.getObj(); 
		// Box는 Object로 설정하였기 "void setObj(Object obj) {" 
		// 때문에 같은 클레스인 (Object)로 받아서 처리 "Object o1 = aBox.getObj(); " 할 수 있다.
		//하위 클레스 (Apple)는 상위 클레스를 참조 할 수 없다, 
		//하지만, object가 apple을 참조 "aBox.setObj(new Apple());" 하고 있기 때문에 apple로 받을 수 있다. 
		//하지만 형변환 "Apple a1 = (Apple)aBox.getObj(); "이 필요했다.
		
		System.out.println(o1 +" "+o1.toString());
		System.out.println(a1 +" "+a1.toString());
		
	}
}
