package chp15;

import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.Writer;

public class Test9_1{
	public static void main(String[] args) throws Exception {
		FileOutputStream os = new FileOutputStream("test.txt",true);
		Writer w = new OutputStreamWriter(os, "GBK");
		PrintWriter pw = new PrintWriter(w);
		pw.println("Hello World");
		pw.close();
	}
}