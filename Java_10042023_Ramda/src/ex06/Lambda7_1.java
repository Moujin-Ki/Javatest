package ex06;


import java.util.function.BiFunction;
import java.util.function.Function;


public class Lambda7_1 {
	public static void main(String[] args) {
		Function<Integer, Integer> f1 = x -> x*x; 
		System.out.println(f1.apply(5));
		
		BiFunction<Integer, Integer, Integer> bif1 = (x,y)-> x+y;
		System.out.println(bif1.apply(10, 10));
		
		BiFunction<Integer, Integer, Integer> bif2 = (x,y)-> x-y;
		System.out.println(bif2.apply(10, 5));
		
	}
}
