package ex02;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class collectExam {

	public static void main(String[] args) {
		
		List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9);
		
		Map<String, List<Integer>> evenOddMap =
				numbers.stream()
				.collect(Collectors.groupingBy(n->n%2==1? "Odd" : "Even"));
		System.out.println(evenOddMap.get("Odd"));
		System.out.println(evenOddMap.get("Even"));
	}

}
