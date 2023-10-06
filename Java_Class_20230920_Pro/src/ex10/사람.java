package ex10;

public class 사람 {
	private String 이름;
	int 나이;
	
	public 사람() {}
	public 사람(String 이름, int 나이) {
		this.이름 = 이름;
		this.나이 = 나이;
	}

	public void 사람info() {
		System.out.println(이름);
		System.out.println(나이);
	}
	
	
}
