package ex06;

@FunctionalInterface
interface exam5{
	int sumArr(int[] arr);

}

public class Lambda9 {
	public static void main(String[] args) {
		exam5 cal = 
				(int[] arr) -> {
				int sum = 0;
				for(int i :arr)
					sum += i;
				return sum;
				};
		int[] arr = {1,2,3,4,5};
				
		int result = cal.sumArr(arr);
		System.out.println(result);
	}
}
