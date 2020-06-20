package generic;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class TestGenericCollection {

	public static void main(String[] args) {

		
		ArrayList<Double> list = new ArrayList<Double>();
		
//		list.add(10);
		list.add(10.0);
//		list.add("Hello");
//		list.add('A');
//		list.add(true);
		
		list.add(3.5);

		double sum = 0;
		for (int i = 0; i < list.size(); i++) {
			sum += list.get(i);
		}
		
		List<Integer> myList = new ArrayList<Integer>();
		
		Vector<String> vector = new Vector<String>();
		vector.add("abc");
		
		LinkedList<Boolean> bools = new LinkedList<Boolean>();
		bools.add(true);
		bools.add(false);
	}

}
