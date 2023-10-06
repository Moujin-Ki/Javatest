package ex03;


//1차원배열 -String
public class Exam01 {

	public static void main(String[] args) {
		
	      int[] myArr = new int[5]; 
	      String[] myStr = new String[3];
	      
	      int[] myArr2  = {10,20,30,40,50};
	      
	      String[] myStr2  = {"kor", "eng", "math"};
	      String[] myStr3  =  new String[] {"kor", "eng", "math"};
	      
	      
	      for(int i=0; i<myArr.length; i++) {
//	    	  int num = (int)(Math.random()*100)+1;
	    	  myArr[i] = (int)(Math.random()*45)+1;
	      }
	      
	      for(int i=0; i<myArr.length; i++)
	    	  System.out.println(myArr[i]);
	      
	      for(int i=0; i<myStr3.length; i++)
	    	  System.out.println(myStr3[i]);
		
	}
	
	
	

}









