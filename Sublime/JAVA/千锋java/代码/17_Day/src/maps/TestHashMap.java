package maps;

import java.util.HashMap;

public class TestHashMap {

	public static void main(String[] args) {
		
		HashMap<Integer,String> map = new HashMap<Integer,String>();
		
		map.put(0 , "Hello");
		map.put(1 , "World");
		map.put(2 , "A");
		map.put(3 , "B");
		map.put(4 , "C");
		map.put(5 , "D");
		map.put(6 , "E");
		map.put(0 , "Everyone");
		
		String s = map.remove(1);
		
		for (int i = 0; i < map.size(); i++) {
			if(map.containsKey(i)){
				System.out.println(map.get(i));
			}
		}
		
		System.out.println("±»ÒÆ³ýµÄValueÎª£º" + s);
		
		
		
	}

}
