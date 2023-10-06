package ex10;

import java.util.Random;

//빈도수
public class Exam01 {

	public static void main(String[] args) {
		
		String myStr1 = "java";
		String myStr2 = "java";
		
		System.out.println(myStr1.equals(myStr2));
		
		String myStr3 = new String("java");
		String myStr4 = new String("java");
		System.out.println(myStr3 == myStr4);
		
		System.out.println(myStr3.equals(myStr4));
		
		{
			int  n = 100;
			System.out.println("n : " + n);
		}
		AAA a = new AAA();  //객체 생성
		
		System.out.println(a.num);
		
		BBB b = new BBB();
		System.out.println(b.num2);
		
		add(10);
	}	
	
	static void add(int n) {
		System.out.println(n);
	}
}

class AAA{
	int num=10;
}

class BBB{
	int num2 = 100;
}









