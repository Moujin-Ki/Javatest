package ex05;


//문제..
public class Exam01 {

	public static void main(String[] args) {
		
		int[] number = new int[6];
	      int selectedNumber = 0;
	      
	      for(int i = 0; i < number.length ; i++) {
	         char selectedNumFlag = 'N';
	         selectedNumber = (int)(Math.random() * 45) + 1; // 1~45 사이의 난수
	         System.out.print(selectedNumber + " ");
	         for(int j = 0; j <= i ; j++ ) {
	            if (selectedNumber == number[j] ) {
	               i--;
	               selectedNumFlag = 'Y';
	               break;
	            } 
	         }
	         if(selectedNumFlag == 'N') {
	            number[i] = selectedNumber;
	         }
	      }

	}
}









