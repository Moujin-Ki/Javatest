package ex01;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;

public class CharcerConverterStreamExample {

	public static void main(String[] args) throws IOException {
		String str ="This is a test message 001";
		write(str);
		String data = read();
		System.out.println(data);
	}
	
	static void write(String str) throws IOException{
	OutputStream os = new FileOutputStream("c:/data/test2.txt");
	
	Writer writer = new OutputStreamWriter(os, "utf-8");
	
	writer.write(str);	
	writer.flush();
	writer.close();
	}
	
	static String read() throws IOException{
		InputStream is = new FileInputStream("c:/data/test2.txt");
		Reader reader = new InputStreamReader(is, "utf-8");
		
		char[] data = new char[100];
		int num = reader.read(data);
		reader.close();
		
		String str = new String(data, 0, num);
				
		return str;
	}
	

}
