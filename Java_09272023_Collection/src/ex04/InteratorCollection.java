package ex04;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class InteratorCollection {
	
	public static void main(String[] args) {
		
		List<String> list = new LinkedList<String>();
		
		list.add("Toy");
		list.add("Box");
		list.add("Robot");
		list.add("Box");
		
		Iterator<String> itr = list.iterator(); // 반복자 획득. 한번만 출력이 가능 하다.
		
		
		String str;
		while(itr.hasNext()) {
			str = itr.next();
			System.out.println(str);
		}
		System.out.println("-------------------");
		itr = list.iterator(); // 따라서, 새롭게 출력을 원하면 한번 더 만들어 줘야 한다.
		while(itr.hasNext()) {
			str = itr.next();
			System.out.println(str);
		}
		
	}

}
