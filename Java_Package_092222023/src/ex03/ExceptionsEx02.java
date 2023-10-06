package ex03;

import java.io.File;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionsEx02 {
	
	public static void main(String[] args) throws IOException {
		File file = new File("member.txt");
		
		if (! file.exists()) {
			file.createNewFile();
		}
	}

}
