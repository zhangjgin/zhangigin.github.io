package service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

/**
 * �ͻ���
 * �������ע�����¼����
 */
public class Client {

	private static final Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		Socket client = null;
		try {
			client = new Socket("10.9.21.217",8888);
			
			//�ɼ��û���Ϣ��������ϵ��û���Ϣ�ַ�����
			String userInfo = registMenu();
			
			//����������
			PrintWriter request = new PrintWriter(new OutputStreamWriter(client.getOutputStream(),"UTF-8"));
			
			//�������������������
			request.println(userInfo);
			
			request.flush();
			
			//�����Ӧ����
			BufferedReader response = new BufferedReader(new InputStreamReader(client.getInputStream(),"UTF-8"));
			
			//���շ���������Ӧ���
			String result = response.readLine();
			
			//�ͻ��˱��ش�ӡ�������
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
	 * �ռ��û���Ϣ
	 * @return �������ַ���
	 */
	public static String registMenu(){
		System.out.print("������ѧ�ţ�");
		String id = input.next();
		
		System.out.print("���������룺");
		String pwd = input.next();
		
		System.out.print("������������");
		String name = input.next();
		
		System.out.print("�������Ա�");
		String sex = input.next();

		System.out.print("���������䣺");
		Integer age = input.nextInt();

		System.out.print("������ɼ���");
		Double score = input.nextDouble();
		
		//�����������ַ�����Լ�� --> Э�飩
		return toJSON(id,pwd,name,sex,age,score);
	}
	
	/**
	 * ����ɢ����������һ���и�ʽ���ַ���
	 * @param score 
	 * @param age 
	 * @param sex 
	 * @param name 
	 * @param pwd 
	 * @param id 
	 * @return ��ʽ�ַ���
	 */
	public static String toJSON(String id, String pwd, String name, String sex, Integer age, Double score){
		String json = "{id:"+id+",pwd:"+pwd+",name:"+name+",sex:"+sex+",age:"+age+",score:"+score+"}";
		return json;
	}
}
