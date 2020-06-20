package net;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class TestBioClient {

	public static void main(String[] args) throws UnknownHostException, IOException {

		for (int i = 0; i < 10; i++) {
			Socket client = new Socket("10.9.21.217", 9000);
			PrintWriter out = new PrintWriter(new OutputStreamWriter(client.getOutputStream(), "UTF-8"));
			
			BufferedReader in = new BufferedReader(new InputStreamReader(client.getInputStream(), "UTF-8"));
			
			out.println("HelloWorld"); 
			out.flush();//向服务器发送请求数据
			
			System.out.println(in.readLine());//等待接收服务器响应数据
			
			client.close();
		}
	}

}
