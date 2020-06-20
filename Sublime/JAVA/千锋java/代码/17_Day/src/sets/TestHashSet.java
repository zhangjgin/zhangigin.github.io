package sets;

import java.util.HashSet;

public class TestHashSet {

	public static void main(String[] args) {

		HashSet<String> set = new HashSet<String>();
		
		System.out.println(set.add("A"));
		set.add("B");
		set.add("C");
		set.add("D");
		set.add("E");
		System.out.println(set.add("A"));
		
		for(String str : set){//forEach
			System.out.println(str);
		}
	}

}
