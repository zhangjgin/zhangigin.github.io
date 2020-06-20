package invokes;

import java.lang.reflect.Method;
import java.util.Properties;

public class TestInvokeAnything {

	public static void main(String[] args) throws Exception {

		//invokeAny(new Student(), "exam" , new Class[]{ int.class, double.class} , 111 , 2.3 );
		
		Properties prop = new Properties();
		
		invokeAny(prop , "setProperty" , new Class[]{String.class , String.class} , "CN" , "中国");
		
		System.out.println(prop.getProperty("CN"));
	}

	//通用编程（调用任何一个方法）  lang3
	public static void invokeAny(Object obj , String methodName , Class[] types , Object... args) throws Exception{
		
		//获得类对象
		Class c = obj.getClass();
		
		//获得方法对象Method
		Method m = c.getDeclaredMethod( methodName , types);
		
		//执行方法
		m.invoke(obj, args);
	}
}
