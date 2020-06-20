package net;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class TestInetAddress {

	public static void main(String[] args) throws UnknownHostException {

//		MyClass mc = MyClass.getMyClassInstance();
		
		
		//获得本机IP地址对象
		InetAddress localhost = InetAddress.getLocalHost();
		
		//获得IP地址字符串
		//System.out.println(localhost.getHostAddress());
		
		//获得IP地址对应主机名称
		//System.out.println(localhost.getHostName());
		
		
		//获得任意主机的IP地址对象（IP、主机名、域名）
		InetAddress baidu = InetAddress.getByName("www.baidu.com");
		
		//System.out.println(baidu.getHostAddress());
		
		//System.out.println(baidu.getHostName());
		
		
		//获得任意域名所绑定的所有IP地址对象
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
//		//可以控制创建对象的次数
//		return new MyClass();
//	}
//}