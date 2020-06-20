package chp10;
import java.util.*;

import com.kettas.common.SystemIn;
public class TestWorldCup2 {

	public static void main(String[] args) {
		Map worldCupMap = new HashMap();
		worldCupMap.put("1930", "������");
		worldCupMap.put("1934", "�����");
		worldCupMap.put("1938", "�����");
		worldCupMap.put("1950", "������");
		worldCupMap.put("1954", "�¹�");
		worldCupMap.put("1958", "����");
		worldCupMap.put("1962", "����");
		worldCupMap.put("1966", "Ӣ����");
		worldCupMap.put("1970", "����");
		worldCupMap.put("1974", "�¹�");
		worldCupMap.put("1978", "����͢");
		worldCupMap.put("1982", "�����");
		worldCupMap.put("1986", "����͢");
		worldCupMap.put("1990", "�¹�");
		worldCupMap.put("1994", "����");
		worldCupMap.put("1998", "����");
		worldCupMap.put("2002", "����");
		worldCupMap.put("2006", "�����");
		
		String team = SystemIn.readString();
		
		if (!worldCupMap.containsValue(team)){
			System.out.println("û�л�ù����籭");
		}else{
			Set set = worldCupMap.keySet();
			Iterator iter = set.iterator();
			while(iter.hasNext()){
				Object key = iter.next();
				if (worldCupMap.get(key).equals(team)){
					System.out.print(key + "\t");
				}
			}
			System.out.println();
		}
		
	}

}
