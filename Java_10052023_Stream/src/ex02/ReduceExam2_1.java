package ex02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReduceExam2_1 {
	
	public static void main(String[] args) {
		
		List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9);
		
		Integer oddTotal = numbers.stream()
				.filter(n-> n%2 !=0)
				.reduce(1, (a,b)->a*b);
		System.out.println(oddTotal);
		
		
	}

}
