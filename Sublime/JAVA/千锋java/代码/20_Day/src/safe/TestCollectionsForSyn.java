package safe;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class TestCollectionsForSyn {

	public static void main(String[] args) {

		List<String> list = new ArrayList<String>();//0x11223344   ArrayList
		
		List<String> safeList = Collections.synchronizedList(list);//0x33445566    Collections$SynchronizedCollection
		
		safeList.add("A");
		
		safeList.add("A");
		
		safeList.add("A");
		
		safeList.add("A");
		
	}

}

class SafeCollection<E>{
	
	private Collection c = null;
	
	final Object o = new Object();
			
	public SafeCollection(Collection c){
		this.c = c;
	}
	
	public void add(E e){
		synchronized(o){
			c.add(e);
		}
	}
}


