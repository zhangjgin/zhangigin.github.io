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

		//ԭ�������ֽ������
		OutputStream os = new FileOutputStream("Files\\convert.txt");
		
		//ת��Ϊ�ַ������
		OutputStreamWriter osw = new OutputStreamWriter(os,"GBK");//���ñ��뷽ʽ
		
		//�ٰ�װһ��
		PrintWriter pw = new PrintWriter(osw);
		
		pw.println("���");
		
		pw.println("����");
		
		pw.close();
		
		//--------------------------------------------------------------
		
		InputStream is = new FileInputStream("Files\\convert.txt");
		
		InputStreamReader isr = new InputStreamReader(is , "GBK");//���ý��뷽ʽ
		
		BufferedReader br = new BufferedReader(isr);
		
		while(true){
			String s = br.readLine();
			if(s == null) break;
			System.out.println(s);
		}
		
	}

}
