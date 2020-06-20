package chp10;
import java.util.*;

import com.kettas.common.SystemIn;
public class TestWorldCup {

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
		
		String year = SystemIn.readString();
		if (worldCupMap.containsKey(year)){
			System.out.println(worldCupMap.get(year));
		}else{
			System.out.println(year + "û�о������籭");
		}
	}

}
