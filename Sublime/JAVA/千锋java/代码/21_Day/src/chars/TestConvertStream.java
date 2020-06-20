package chars;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

public class TestConvertStream {

	public static void main(String[] args) throws IOException {

		//原来持有字节输出流
		OutputStream os = new FileOutputStream("Files\\convert.txt");
		
		//转换为字符输出流
		OutputStreamWriter osw = new OutputStreamWriter(os,"GBK");//设置编码方式
		
		//再包装一层
		PrintWriter pw = new PrintWriter(osw);
		
		pw.println("你好");
		
		pw.println("世界");
		
		pw.close();
		
		//--------------------------------------------------------------
		
		InputStream is = new FileInputStream("Files\\convert.txt");
		
		InputStreamReader isr = new InputStreamReader(is , "GBK");//设置解码方式
		
		BufferedReader br = new BufferedReader(isr);
		
		while(true){
			String s = br.readLine();
			if(s == null) break;
			System.out.println(s);
		}
		
	}

}
