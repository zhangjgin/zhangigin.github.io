package safe;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;

public class TestCopyOnWriteArrayList {

	public static void main(String[] args) {

		List<String> list = new CopyOnWriteArrayList<String>();//接口引用指向实现类对象，更容易更换实现
		
		
		Set<String> set = new CopyOnWriteArraySet<String>();
	
		
		Map<String,String> map = new ConcurrentHashMap<String,String>();
		
//		map.put(key, value);
		
		
	}

}
