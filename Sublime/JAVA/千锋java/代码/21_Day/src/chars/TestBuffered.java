package chars;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Reader;
import java.io.Writer;

public class TestBuffered {

	public static void main(String[] args) throws IOException {

		Writer fw = new FileWriter("Files\\b.txt");
		
		PrintWriter pw = new PrintWriter(fw);
		
		pw.println("Hello");
		
		pw.println("World");
		
		pw.println("Goodbye");
		
		pw.close();
		
		
		Reader fr = new FileReader("Files\\b.txt");
		
		BufferedReader br = new BufferedReader(fr);
		
		for(;;){
			String s = br.readLine();
			if(s == null) break;
			System.out.println(s);
		}
	}

}
