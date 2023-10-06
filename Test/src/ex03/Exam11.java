package ex03;

import java.util.ArrayList;

import java.util.List;

public class Exam11 {

	public static void main(String[] args) {
		for(int i =1; i<10; i++) {
			for(int j=1; j<10; j++) {
				int x = j +1+(i-1)/3*3;
				int y = i%3 == 0 ? 3 : i%3;
				
				if(x>9)
					break;
				System.out.print(x +"*" + y + "=" + x*y + "\t");
			}
		System.out.println();
		if(i%3 ==0)
			System.out.println();
		}
	}
}

