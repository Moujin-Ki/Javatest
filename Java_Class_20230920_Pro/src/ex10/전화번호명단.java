package ex10;

public class 전화번호명단 {

	public static void main(String[] args) {
		대학동창 조 = new 대학동창("조조",30,"컴퓨터공학");
//		조.전공 = "컴퓨터공학";
//		조.이름 = "조조";
//		조.나이 = 30;
		
//		System.out.println(조.get이름());
		조.사람info();
		System.out.println("-----------------");
		동호회 동 = new 동호회("유비", 35,"칼싸움");
		동.사람info();
		
		직장동료 직 = new 직장동료("관우",38, "말타기");
	}

}
