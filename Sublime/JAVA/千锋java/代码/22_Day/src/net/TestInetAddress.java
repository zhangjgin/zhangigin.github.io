package net;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class TestInetAddress {

	public static void main(String[] args) throws UnknownHostException {

//		MyClass mc = MyClass.getMyClassInstance();
		
		
		//��ñ���IP��ַ����
		InetAddress localhost = InetAddress.getLocalHost();
		
		//���IP��ַ�ַ���
		//System.out.println(localhost.getHostAddress());
		
		//���IP��ַ��Ӧ��������
		//System.out.println(localhost.getHostName());
		
		
		//�������������IP��ַ����IP����������������
		InetAddress baidu = InetAddress.getByName("www.baidu.com");
		
		//System.out.println(baidu.getHostAddress());
		
		//System.out.println(baidu.getHostName());
		
		
		//��������������󶨵�����IP��ַ����
		InetAddress[] addrs = InetAddress.getAllByName("www.baidu.com");
		
		for (InetAddress addr : addrs) {
			System.out.println(addr.getHostAddress());
			System.out.println(addr.getHostName());
		}
		
	}

}


//class MyClass{
//	private MyClass(){
//		
//	}
//	
//	public static MyClass getMyClassInstance(){
//		//���Կ��ƴ�������Ĵ���
//		return new MyClass();
//	}
//}