package maps;

import java.util.Hashtable;
import java.util.Properties;

public class TestProperties {

	public static void main(String[] args) {
		
//		Hashtable table = new Hashtable();

		Properties prop = new Properties();
		
		//prop.put("aaa", new Object());//Error ����ȫ   ��ƴ���覴ã��̳���һ�����ü̳еĸ��ࣩ
		
		prop.setProperty("aaa", "bbb");
		prop.setProperty("ccc", "ddd");
		
		System.out.println(prop.getProperty("aaa"));
		System.out.println(prop.getProperty("ccc"));
		
		
	}

}
