package test;

import java.util.HashMap;
import java.util.Map;

public class Test2 {

	public static void main(String[] args) {

		String str = "fdashf1jkdsah934758947389hvjdiohf890137249083290892jfodsj1f90453690";
		
		Map<Character , Integer> counter = new HashMap<Character , Integer>();
		
		//ͳ�� = ����
		
		//��ÿ���ַ��Ƿ��ǵ�һ�γ��֣�����ǣ����¼���ִ���Ϊ1��������ǣ�����ԭ�еĴ�����+1.
		
		
		for (int i = 0; i < str.length() ; i++) {
			
			Character currentChar = str.charAt(i);
			
			if(!counter.containsKey(currentChar)){
				//��
				counter.put(currentChar, 1);
			}else{
				//��
				int oldValue = counter.get(currentChar);
				counter.put(currentChar, oldValue+1);
			}
		}
		
		
		for (Map.Entry<Character,Integer> entry : counter.entrySet()) {
			System.out.println(entry);
		}
		
	/*	
		String str = "4872195743897569586478932178943721949014890125890";
				
				
		int[] counter = new int[10];
		
		counter[0]  5*/
		
	}

}
