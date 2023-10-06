package ex06_interface;

public class MainClass {
	public static void main(String[] args) {
		Printable prn = new LPrinter();
		String msg = "헬로 월드";
				prn.print(msg);
		prn = new SPrinter();
		prn.print(msg);
		
		CSPrint p = new SPrinter();
		p.cprint(msg);
		p.print(msg);
	}
}
