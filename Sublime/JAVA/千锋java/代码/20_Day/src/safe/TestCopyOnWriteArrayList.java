package safe;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;

public class TestCopyOnWriteArrayList {

	public static void main(String[] args) {

		List<String> list = new CopyOnWriteArrayList<String>();//�ӿ�����ָ��ʵ������󣬸����׸���ʵ��
		
		
		Set<String> set = new CopyOnWriteArraySet<String>();
	
		
		Map<String,String> map = new ConcurrentHashMap<String,String>();
		
//		map.put(key, value);
		
		
	}

}
