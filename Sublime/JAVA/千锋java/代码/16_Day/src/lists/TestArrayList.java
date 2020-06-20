package lists;

import java.util.ArrayList;

public class TestArrayList {
	public static void main(String[] args) {

		ArrayList list = new ArrayList(20);
		
//		list.elementData //Error 私有属性（数组）
		
//		System.out.println(list.add("A"));
//		
//		System.out.println(list.get(0));
//		
//		System.out.println(list.remove("A"));
//		
//		System.out.println(list.get(0));
		
		list.add("A");
		list.add("B");
		list.add("C");
		list.add(0, "D");
		//list.clear();
		
		for (int i = 0; i < list.size(); i++) {
			//System.out.println(list.get(i));
		}
		
		System.out.println(list.size());
		
		
		Object[] objs = list.toArray();
		
		for (int i = 0; i < objs.length; i++) {
			System.out.println(objs[i]);
		}
		
	}
}
