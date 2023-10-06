package ex02;

public class Exam01 {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("Hello"); // Arraylist 보다 사용하기 편리하다. 사용하도록 추천
		sb.append("Programming");
		System.out.println(sb);
		sb.insert(6, "Java");
		System.out.println(sb);
		sb.replace(1, 4, "Good");
		System.out.println(sb);
		sb.delete(1, 5);
		System.out.println(sb);
		sb.reverse();
		System.out.println(sb);
	}

}
