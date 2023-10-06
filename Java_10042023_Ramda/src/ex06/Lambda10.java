package ex06;

import java.util.function.Function;
import java.util.function.Predicate;

public class Lambda10 {
	public static void main(String[] args) {
		Predicate<Integer> p1 = new Predicate<Integer>() {
			
			@Override
			public boolean test(Integer x) {
				return x%2==0;
			}
		};
		boolean flag = p1.test((int)(Math.random()*100));
		String msg = flag == true ? "Even" : "Odd";
		
		System.out.println(msg);
		System.out.println("------------------------");
		
Predicate<Integer> p2 = 		
			x -> x%2==0;
			
		
		flag = p1.test((int)(Math.random()*100));
		msg = flag == true ? "Even" : "Odd";
		
		System.out.println(msg);
		
		
		}
	}

