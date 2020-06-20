package net;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class TestBioServer {

	public static void main(String[] args) throws IOException {
		
		System.out.println("����������...");
		
		ServerSocket server = new ServerSocket(9000);//����������
		
		for(;;){
			
			final Socket s = server.accept();// ͬ�⡢���ܣ��ȴ��ͻ��˵Ľ��룩 ���������� Listener
			
			new Thread(){
				public void run(){
					System.out.println(s.getInetAddress().getHostName());
					
					try {
						PrintWriter out = new PrintWriter(new OutputStreamWriter(
								s.getOutputStream(), "UTF-8"));
						BufferedReader in = new BufferedReader(new InputStreamReader(
								s.getInputStream(), "UTF-8"));
						
						String str = in.readLine();//�ȴ����տͻ��˵���������
						
						out.println(str);
						out.flush();//��ͻ��˷�����Ӧ����
						
					} catch (Exception e) {
						e.printStackTrace();
					} finally{
						try {
							s.close();
						} catch (IOException e) {
							e.printStackTrace();
						}
					}
				}
			}.start();
		}
		
		/*BufferedReader in = new BufferedReader(new InputStreamReader(s.getInputStream(),"UTF-8"));
		PrintWriter out = new PrintWriter(new OutputStreamWriter(s.getOutputStream(),"UTF-8"));
		
		String str = in.readLine();
		out.println(str);
		out.flush();*/
	}

}
