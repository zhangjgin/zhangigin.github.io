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
		
		System.out.println("服务器启动...");
		
		ServerSocket server = new ServerSocket(9000);//创建服务器
		
		for(;;){
			
			final Socket s = server.accept();// 同意、接受（等待客户端的接入） 监听、侦听 Listener
			
			new Thread(){
				public void run(){
					System.out.println(s.getInetAddress().getHostName());
					
					try {
						PrintWriter out = new PrintWriter(new OutputStreamWriter(
								s.getOutputStream(), "UTF-8"));
						BufferedReader in = new BufferedReader(new InputStreamReader(
								s.getInputStream(), "UTF-8"));
						
						String str = in.readLine();//等待接收客户端的请求数据
						
						out.println(str);
						out.flush();//向客户端发送响应数据
						
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
