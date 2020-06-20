package service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

/**
 * 客户端
 * 用以完成注册与登录功能
 */
public class Client {

	private static final Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		Socket client = null;
		try {
			client = new Socket("10.9.21.217",8888);
			
			//采集用户信息（整理完毕的用户信息字符串）
			String userInfo = registMenu();
			
			//获得请求对象
			PrintWriter request = new PrintWriter(new OutputStreamWriter(client.getOutputStream(),"UTF-8"));
			
			//向服务器发送请求数据
			request.println(userInfo);
			
			request.flush();
			
			//获得响应对象
			BufferedReader response = new BufferedReader(new InputStreamReader(client.getInputStream(),"UTF-8"));
			
			//接收服务器的响应结果
			String result = response.readLine();
			
			//客户端本地打印操作结果
			System.out.println(result);
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally{
			try {
				client.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	/**
	 * 收集用户信息
	 * @return 整理后的字符串
	 */
	public static String registMenu(){
		System.out.print("请输入学号：");
		String id = input.next();
		
		System.out.print("请输入密码：");
		String pwd = input.next();
		
		System.out.print("请输入姓名：");
		String name = input.next();
		
		System.out.print("请输入性别：");
		String sex = input.next();

		System.out.print("请输入年龄：");
		Integer age = input.nextInt();

		System.out.print("请输入成绩：");
		Double score = input.nextDouble();
		
		//返回整理后的字符串（约定 --> 协议）
		return toJSON(id,pwd,name,sex,age,score);
	}
	
	/**
	 * 将零散数据整个成一个有格式的字符串
	 * @param score 
	 * @param age 
	 * @param sex 
	 * @param name 
	 * @param pwd 
	 * @param id 
	 * @return 格式字符串
	 */
	public static String toJSON(String id, String pwd, String name, String sex, Integer age, Double score){
		String json = "{id:"+id+",pwd:"+pwd+",name:"+name+",sex:"+sex+",age:"+age+",score:"+score+"}";
		return json;
	}
}
