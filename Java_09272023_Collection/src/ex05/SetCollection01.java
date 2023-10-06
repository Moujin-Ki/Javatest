package ex05;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.Vector;

public class SetCollection01 {
	
	public static void main(String[] args) {
		
//		List<String> list = new Vector<String>();
		
		Set<String> list = new HashSet<String>();
		list.add("Toy");
		list.add("Box");
		list.add("Robot");
		list.add("Box");
		
		for(String s : list)
			System.out.println(s);
		System.out.println("------------------");
		
		Iterator<String> itr = list.iterator(); // 반복자 획득. 한번만 출력이 가능 하다.
		
		
		String str;
		while(itr.hasNext()) {
			str = itr.next();
			if(str.equals("Box"))
				itr.remove();
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
