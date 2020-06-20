package chp14;
import java.net.*;
import java.io.*;
public class UpperCaseClient {

	public static void main(String[] args) throws Exception {
		Socket s = new Socket("127.0.0.1", 9001);
		
		//��װ������
		PrintWriter pw = new PrintWriter(s.getOutputStream());
		//д����
		pw.println("hello world");
		//ע��ˢ�»�����
		pw.flush();
		
		//������
		BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
		String line = br.readLine();
		
		System.out.println(line);
		
		//�ر�socket
		s.close();
	}

}
