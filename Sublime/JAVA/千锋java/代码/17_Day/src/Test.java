package test;

import java.util.HashMap;
import java.util.Map;

public class Test {

	public static void main(String[] args) {

		Map<String,String> map = new HashMap<String,String>();
		
		map.put("2006","意大利");
		map.put("1994","巴西");
		map.put("2002","巴西");
		
		
		String str = "荷兰";
		
		boolean flag = false;
		
		for (Map.Entry<String,String> entry: map.entrySet()) {
			if(str.equals(entry.getValue())){
				flag = true;
				System.out.println(entry.getKey());
			}
		}
		
		//map.contaisValue(str)
		if(!flag){
			System.out.println("从未夺冠");
		}
		
		
	}

}
