package maps;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class TestHashMapApply {

	public static void main(String[] args) {

		//�й� ���� ���� ����� �ձ� 
		
		//String s = XXX.countries.get(null);
		//System.out.println(s);
		
		//���м�
		Set<String> keys = Country.countries.keySet();
		for (String k : keys) {
			//System.out.println(k);
		}
		
		//����ֵ
		Collection<String> values = Country.countries.values();
		for (String v : values) {
			//System.out.println(v);
		}
		
		//���м�+ֵ
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
		countries.put("CN","�л����񹲺͹�");
		countries.put("US","��������ڹ�");
		countries.put("KR","����");
		countries.put("IT","�����");
		countries.put("JP","�ձ�");
		countries.put(null,null);
		countries.put("A",null);
		countries.put(null,"C");
	}
}