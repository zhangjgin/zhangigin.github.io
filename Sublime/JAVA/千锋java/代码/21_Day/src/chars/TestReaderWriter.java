package chars;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class TestReaderWriter {

	public static void main(String[] args) throws IOException {

		Writer fw = new FileWriter("Files\\chars.txt");
		
		fw.write("HelloWorld");
		
		fw.flush();
		
		fw.close();
		
		Reader fr = new FileReader("Files\\chars.txt");
		
		char[] cache = new char[4];
		
		while(true){
			int n = fr.read(cache);
			
			if(n == -1) break;
			
			for (int i = 0; i < n; i++) {
				System.out.print( cache[i] );
			}
			System.out.println();
		}
		
	}

}
