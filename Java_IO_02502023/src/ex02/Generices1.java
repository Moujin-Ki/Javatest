package ex02;

class Apple{
	public String toString() {
		return "I am an apple";
	}
	
}

class Orange{
	public String toString() {
		return "I am an Prance";
	}
	
}
class AppleBox{ //사과 담는 박스
	private Apple ap;
	
	void setApple(Apple ap) {
		this.ap = ap;
	}
	
	Apple getApple(){
		return ap;
	}
	
}
class OrangeBox{ //사과 담는 박스
	private Orange op;
	
	void setOrange(Orange op) {
		this.op = op;
	}
	
	Orange getOrange(){
		return op;
	}
	
}
public class Generices1 {
	public static void main(String[] args) {
		AppleBox abox = new AppleBox();
		OrangeBox oBox = new OrangeBox();
		
		abox.setApple(new Apple());
		oBox.setOrange(new Orange());
		
		Apple a = abox.getApple();
		Orange o = oBox.getOrange();
		System.out.println(a);
		System.out.println(o);
	}
}
