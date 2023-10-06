package ex01;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class ReadExample {

	public static void main(String[] args) {
		try {
			InputStream is = new FileInputStream("c:/data/test1.db");
			while(true) {
				int data = is.read(); // 1byte 읽기
				if(data == -1) break;
				
				System.out.println(data);
			}
			is.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		System.out.println("프로그램 종료!!!");
	}

}
