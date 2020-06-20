package service;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Properties;

public class Server {

	public static void main(String[] args) {
		
		try {
			ServerSocket server = new ServerSocket(8888);
			
			//接入客户端
			Socket client = server.accept();
			
			//获得请求对象
			BufferedReader request = new BufferedReader(new InputStreamReader(client.getInputStream(),"UTF-8"));
			
			
			//接收客户端请求数据
			String userInfo = request.readLine();
			
			//保存用户信息
			String result = saveUserInfo(userInfo);
			
			//获得响应对象
			PrintWriter response = new PrintWriter(new OutputStreamWriter(client.getOutputStream(),"UTF-8"));
			
			//将操作结果响应给客户端
			response.println(result);
			
			response.flush();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	//将用户的数据保存在服务器的文件中
	public static String saveUserInfo(String userInfo){
		try {
			//创建流，执行一个properties文件
			PrintWriter out = new PrintWriter(new OutputStreamWriter( new FileOutputStream("informations\\userInfo.properties",true),"UTF-8"));
			
			//解析出id的值作为"="前的key、直接将userInfo代表的字符串作为"="后的value
			String id = getId(userInfo);
			
			//保存用户信息到文件中
			Properties prop = new Properties();
			prop.setProperty(id , userInfo);
			prop.store(out, "");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "RegisterSuccessful";
	}
	
	//解析出id的值
	public static String getId(String userInfo){
		int startIndex = userInfo.indexOf(":")+1;
		int endIndex = userInfo.indexOf(",");
		return userInfo.substring(startIndex,endIndex);
	}
}
