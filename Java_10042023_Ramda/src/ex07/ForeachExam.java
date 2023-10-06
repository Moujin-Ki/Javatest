package ex07;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ForeachExam {

	public static void main(String[] args) {
		List<String> lists = Arrays.asList("Box", "Toy", "Robot", "Toy", "Box");
		
		for(String list : lists)
			System.out.println(list);
		System.out.println("-------------------------");
		lists.forEach(s->System.out.println(s));
		
		System.out.println("-------------------------");
		lists.forEach(System.out::println);
	}

}
