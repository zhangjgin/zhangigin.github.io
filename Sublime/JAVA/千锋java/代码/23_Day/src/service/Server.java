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
			
			//����ͻ���
			Socket client = server.accept();
			
			//����������
			BufferedReader request = new BufferedReader(new InputStreamReader(client.getInputStream(),"UTF-8"));
			
			
			//���տͻ�����������
			String userInfo = request.readLine();
			
			//�����û���Ϣ
			String result = saveUserInfo(userInfo);
			
			//�����Ӧ����
			PrintWriter response = new PrintWriter(new OutputStreamWriter(client.getOutputStream(),"UTF-8"));
			
			//�����������Ӧ���ͻ���
			response.println(result);
			
			response.flush();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	//���û������ݱ����ڷ��������ļ���
	public static String saveUserInfo(String userInfo){
		try {
			//��������ִ��һ��properties�ļ�
			PrintWriter out = new PrintWriter(new OutputStreamWriter( new FileOutputStream("informations\\userInfo.properties",true),"UTF-8"));
			
			//������id��ֵ��Ϊ"="ǰ��key��ֱ�ӽ�userInfo������ַ�����Ϊ"="���value
			String id = getId(userInfo);
			
			//�����û���Ϣ���ļ���
			Properties prop = new Properties();
			prop.setProperty(id , userInfo);
			prop.store(out, "");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "RegisterSuccessful";
	}
	
	//������id��ֵ
	public static String getId(String userInfo){
		int startIndex = userInfo.indexOf(":")+1;
		int endIndex = userInfo.indexOf(",");
		return userInfo.substring(startIndex,endIndex);
	}
}
