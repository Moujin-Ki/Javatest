package ex02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReduceExam2 {
	
	public static void main(String[] args) {
		
		List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9);
		
		Integer sum = numbers.stream()
			.reduce(0, (a,b)->a+b);
		System.out.println(sum);
		
		System.out.println("--------------");
		List<String> words = Arrays.asList("apple", "banana", "cherry", "pineappe", "elderberry");
		
		Integer totoalLength = words.stream()
			.map(s->s.length())
			.reduce(0,  (a,b)->a+b);
		System.out.println(totoalLength);
		System.out.println("--------------");
		
		List<Integer> nums = new ArrayList<Integer>();
		
		for(int i =0; i<10; i++) {
			nums.add((int)(Math.random()*100));
		}
		for(Integer i : nums)
			System.out.print(i + " ");
		
		Integer max = nums.stream()
			.reduce(Integer.MIN_VALUE, (a,b)->Integer.max(a, b));
		
		System.out.println(max);
		
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.MAX_VALUE);
		System.out.println("--------------");
		
		List<String> word = Arrays.asList("Hello", " ", "World", "!");
		
		String combind = word.stream().reduce("",(a,b) -> a+b);
		System.out.println(combind);
		
		
	}

}
