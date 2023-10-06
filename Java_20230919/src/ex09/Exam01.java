package ex09;

public class Exam01 {
	
	public static void main(String[] args) {
		
		
		String myStr1 = "java";
		String myStr2 = "java";
		
		System.out.println(myStr1 == myStr2);
		
		String myStr3 = new String("java");
		String myStr4 = new String("java");
		System.out.println(myStr3 == myStr4);
		System.out.println(myStr3.equals(myStr4));
		
	}

}
