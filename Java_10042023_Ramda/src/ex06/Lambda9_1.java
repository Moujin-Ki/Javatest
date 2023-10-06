package ex06;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.ToIntFunction;

public class Lambda9_1 {
	public static void main(String[] args) {
		Function<Integer[], Integer> exam = 
			(Integer[] arr) -> {
				int sum = 0;
				for(int i : arr)
				sum += i;
				return sum;
				};
		
				
		int[] arr = {1,2,3,4,5};
			
		int result = exam.apply(new Integer[]{1,2,3,4,5});
		System.out.println(result);
	}
}
