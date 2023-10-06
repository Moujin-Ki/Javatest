package ex12;

//빈도수
public class Exam01 {

	public static void main(String[] args) {
		
		int[] lotto = new int[6];
		
		for(int i=0; i<lotto.length; i++) {
			lotto[i] = (int)(Math.random()*45+1);
			if(i>0) {
				for(int j=0; j<i; j++) {
					if(lotto[i] == lotto[j]) {
						 
						break;
					}
				}
			}
		}
		for(int i=0; i<lotto.length; i++)
			System.out.print(lotto[i] + " ");
		
	}
}









