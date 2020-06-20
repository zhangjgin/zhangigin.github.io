package maps;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class TestHashMapApply {

	public static void main(String[] args) {

		//中国 美国 韩国 意大利 日本 
		
		//String s = XXX.countries.get(null);
		//System.out.println(s);
		
		//所有键
		Set<String> keys = Country.countries.keySet();
		for (String k : keys) {
			//System.out.println(k);
		}
		
		//所有值
		Collection<String> values = Country.countries.values();
		for (String v : values) {
			//System.out.println(v);
		}
		
		//所有键+值
		Set<Map.Entry<String,String>> entrys = Country.countries.entrySet();
		
		for (Map.Entry<String, String> entry : entrys) {
			//System.out.println(entry.getKey() +"\t"+ entry.getValue());
			System.out.println(entry);
		}
		
		// & | >> << >>> ^ 
		
		//10 = 1010
		//7 =  0111
		//----------
//			   0010
		
		System.out.println(10 & 7);
	}

}

class Country{
	public static final Map<String , String> countries = new HashMap<String , String>();
	
	static{
		countries.put("CN","中华人民共和国");
		countries.put("US","美利坚合众国");
		countries.put("KR","韩国");
		countries.put("IT","意大利");
		countries.put("JP","日本");
		countries.put(null,null);
		countries.put("A",null);
		countries.put(null,"C");
	}
}