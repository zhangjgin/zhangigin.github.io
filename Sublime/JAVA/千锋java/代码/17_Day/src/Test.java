package test;

import java.util.HashMap;
import java.util.Map;

public class Test {

	public static void main(String[] args) {

		Map<String,String> map = new HashMap<String,String>();
		
		map.put("2006","�����");
		map.put("1994","����");
		map.put("2002","����");
		
		
		String str = "����";
		
		boolean flag = false;
		
		for (Map.Entry<String,String> entry: map.entrySet()) {
			if(str.equals(entry.getValue())){
				flag = true;
				System.out.println(entry.getKey());
			}
		}
		
		//map.contaisValue(str)
		if(!flag){
			System.out.println("��δ���");
		}
		
		
	}

}
