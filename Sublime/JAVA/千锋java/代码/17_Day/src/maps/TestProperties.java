package maps;

import java.util.Hashtable;
import java.util.Properties;

public class TestProperties {

	public static void main(String[] args) {
		
//		Hashtable table = new Hashtable();

		Properties prop = new Properties();
		
		//prop.put("aaa", new Object());//Error 不安全   设计存在瑕疵（继承了一个不该继承的父类）
		
		prop.setProperty("aaa", "bbb");
		prop.setProperty("ccc", "ddd");
		
		System.out.println(prop.getProperty("aaa"));
		System.out.println(prop.getProperty("ccc"));
		
		
	}

}
