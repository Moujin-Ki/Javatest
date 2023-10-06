package OT_09192023;

import java.util.Scanner;

public class Exam01 {

	public static void main(String[] args) {
		int sum = 0;
		for (int i = 0 ; i<= 100 ; i = i+2) {
			sum = sum +i;
		}
		System.out.println(sum);
		
		for (int i = 0 ; i<= 100 ; i = i+1) {
			int j = i%5;
			if (j == 0)
				System.out.printf("%d ", i);
		}
		
		String[] Aph = {"A","B","C","D","E","F","G","H","I","J","K","L","M","N"};
			for (int i = 1; i<Aph.length; i= i+2) {
				System.out.print(Aph[i]);
			}
				
		Scanner sc = new Scanner(System.in);
		System.out.println("입력 : ");
		int num = sc.nextInt();
		int sum01 = 0;
		for(int i=0; i<=num; i++) {
			sum01 = sum01 + i;
		}
		System.out.println(sum01);
		
		int[] arr;
		for (int i=1; i<=30; i=i+1) {
			if (i%2 == 0);
			
		}
	
	}

}
