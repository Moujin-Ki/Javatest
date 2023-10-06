package ex11;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

//빈도수
public class Exam01 {

	public static void main(String[] args) {
		
//		ArrayList a = new ArrayList();
//		LinkedList  a = new LinkedList();
		List a = new ArrayList();
		
		a.add(10);
		a.add("kor");
		a.add(10.2);
		
		for(Object o : a)
			System.out.print(o + " ");
	}
}









