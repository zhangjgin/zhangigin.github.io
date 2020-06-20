package lists;

import java.util.ArrayList;

public class TestUseArrayList {

	public static void main(String[] args) {

		ArrayList scores = new ArrayList();//[object object object]

		scores.add(99D);
		scores.add(95D);
		scores.add(96D);
		scores.add(98D);
		scores.add(97D);
		
		double sum = 0;
		
		for (int i = 0; i < scores.size() ; i++) {
			sum += (double)scores.get(i);
		}
		
		System.out.println(sum / scores.size());
	}

}
