package ex06;

@FunctionalInterface
interface exam2{
	void printVar(String name, int i);

}


public class Lambda6 {
	public static void main(String[] args) {
		exam2 cal = 
			(String name, int i)-> System.out.println(name+"="+i);
				

		cal.printVar("Test", 1);
	}
}
