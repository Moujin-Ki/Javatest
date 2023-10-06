package ex02;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

import javax.swing.text.StyledEditorKit.ForegroundAction;

class PriceInfo02 {
	private String model;
	private int price;
	public PriceInfo02(String model, int price) {
		this.model = model;
		this.price = price;
	}
	
	public int getPrice() {return price;}
	public String getModel() {return model;}

	public int length() {
		return 0;
	}
	
}

public class StreamExam2_1 {
	
	public static void main(String[] args) {
		List<PriceInfo02> lists = new ArrayList<PriceInfo02>();
		lists.add(new PriceInfo02("Toy", 500));
		lists.add(new PriceInfo02("Robot", 1500));
		lists.add(new PriceInfo02("Box", 700));
		lists.add(new PriceInfo02("Test", 1700));
		lists.add(new PriceInfo02("Water", 9000));
		
		lists.stream().filter(m-> m.getModel().length()>4)
		.map(m->m.getModel())
		.forEach(m-> System.out.println(m));
		
		/*
		 * 1. PriceInfo 클래스 맴버변수 modle getter 생성
		 * 2. 필터링 조건" model이 참조하는 문자열 길이가 4이상이면 해당 인스턴스 통과
		 * 3. 맵핑 방법 : PriceInfo 인스턴스 -> String 인스턴스(모델링)
		 * 4. forEach로 2.3 조건 만족하는 인스턴스만 출력
		 */
	}

}
