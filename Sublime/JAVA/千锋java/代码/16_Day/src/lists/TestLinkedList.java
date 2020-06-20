package lists;

import java.util.LinkedList;

public class TestLinkedList {

	public static void main(String[] args) {

		LinkedList list = new LinkedList();
		
		list.add("A");
		list.add("B");
		list.add(2,"C");
		
		list.addFirst("D");
		list.addLast("E");
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
	}

}
