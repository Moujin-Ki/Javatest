package ex06;

interface Cal{
	int max(int num1, int num2);
}

class Max implements Cal{
	@Override
	public int max(int num1, int num2) {
		return num1>num2 ? num1: num2;
	}
}

public class Lambda4 {
	public static void main(String[] args) {
		Cal cal = new Max();
		
		int reuslt = cal.max(5, 10);
		System.out.println(reuslt);
	}
}
