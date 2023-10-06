package ex08;

public class Exam01 {
	
	public static void main(String[] args) {
		
		int[] numA = new int[10];
		int[] numB = new int[10];
		
		for(int i=0; i<numA.length; i++) 
			numA[i] = (int)(Math.random()*10);
		
		for(int j=0; j<numA.length-1; j++) 
			System.out.println(numA[j] + " ");
			System.out.println();

		for(int i=0; i<numA.length; i++)
			numB[numA[i]]++;

		for(int i=1; i<numA.length; i++) 
			System.out.printf("%d의 개수: %d\n", i, numB[i]);
	}
}
