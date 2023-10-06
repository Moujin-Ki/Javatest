package ex06_interface;

public class SPrinter implements CSPrint {

	@Override
	public void print(String msg) {
		System.out.print("삼성플린터 흑백 출력 :");
		System.out.println(msg);
	}
	
	@Override
	public void cprint(String msg) {
		System.out.print("삼성플린터 칼라 출력 :");
		System.out.println(msg);
	}
	
}
