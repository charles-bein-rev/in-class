package filestreams;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class StreamSimulator {
	
	
	
	private static final String FILES_MY_FILE_TXT = "files/myFile.txt";

	public static void main(String[] args) {
		System.out.println("START");
		try {
		fosExample();
		fisExample();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("END");
	}
	
	public static void fosExample() throws IOException {
		FileOutputStream fos= new FileOutputStream(FILES_MY_FILE_TXT);
		for(char letter = 'A'; letter <= 'Z'; letter++) {
			fos.write(letter);
		}
		if (fos != null)
			fos.close();
	}
	
	public static void fisExample() throws IOException {
		FileInputStream fis = new FileInputStream(FILES_MY_FILE_TXT);
		
		byte input;
		while((input = (byte)fis.read()) != -1) {
			System.out.print((char)input);
		}
		System.out.println();
		
		if (fis != null)
			fis.close();
	}
}
