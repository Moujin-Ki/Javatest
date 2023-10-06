package ex04;


//문제..
public class Exam01 {

	public static void main(String[] args) {
		
	     //1. 랜덤을 이용해서 5명 학생 점수를 입력받는다.
		 //2. 5명 점수 총점과 평균을 구한다.
	     //3. 최대값 , 최소값 출력
		int[] students = new int[5];
		int total =0;
		double avg = 0;
		
		for(int i=0; i<students.length; i++)  //입력
			students[i] = (int)(Math.random()*100)+1;
		
		System.out.print("입력데이타 : ");
		for(int i=0; i<students.length; i++) { // 총점 계산
			System.out.print(students[i] + " ");
			total += students[i];
		}
		System.out.println();
		avg = (double)total/students.length;  //평균 계산
		
		System.out.println("총점 : " + total);
		System.out.printf("평균 :%.2f\n", avg );
		System.out.println("----------------------------------");
		
		//최대값, 최소값 구현
		int max = students[0];
		int min = students[0];
		for(int i=1; i<students.length; i++) {
			if(max < students[i])
				max = students[i];
			if(min > students[i])
				min = students[i];
		}
		
		System.out.println("최대값 : " + max);
		System.out.println("최소값 : " + min);
		System.out.println("----------------------------------");
	
		//입력 데이타를 오름차순 정렬
		for(int i=0; i<students.length; i++) {
			boolean flag = false;  //?
			for(int j=0; j<students.length-1; j++) {
				
				if(students[j]>students[j+1]) {
					int tmp = students[j];
					students[j] = students[j+1];
					students[j+1] =tmp;
					flag = true;
				}
			}
			if(!flag) break;
		}
		
		System.out.println("\n정렬데이타 : ");
		for(int i=0; i<students.length; i++) 
			System.out.print(students[i] + " ");
	}
	
 
	

}









