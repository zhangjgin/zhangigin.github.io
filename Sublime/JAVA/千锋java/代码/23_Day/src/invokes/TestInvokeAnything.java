package invokes;

import java.lang.reflect.Method;
import java.util.Properties;

public class TestInvokeAnything {

	public static void main(String[] args) throws Exception {

		//invokeAny(new Student(), "exam" , new Class[]{ int.class, double.class} , 111 , 2.3 );
		
		Properties prop = new Properties();
		
		invokeAny(prop , "setProperty" , new Class[]{String.class , String.class} , "CN" , "�й�");
		
		System.out.println(prop.getProperty("CN"));
	}

	//ͨ�ñ�̣������κ�һ��������  lang3
	public static void invokeAny(Object obj , String methodName , Class[] types , Object... args) throws Exception{
		
		//��������
		Class c = obj.getClass();
		
		//��÷�������Method
		Method m = c.getDeclaredMethod( methodName , types);
		
		//ִ�з���
		m.invoke(obj, args);
	}
}
