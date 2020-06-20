package generic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestCollections {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<Integer>();
		
		list.add(1);
		list.add(3);
		list.add(5);
		list.add(7);
		
		Collections.reverse(list);
		
		Collections.shuffle(list);
		
		Collections.sort(list);
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		
		List<Student> stus = new ArrayList<Student>();
		stus.add(new Student());
		stus.add(new Student());
		
		Collections.sort(stus);
		
	}
	
	//public static <?> void sort(List<?> list) {}

}



class Student implements Comparable<Student>{
	
	Integer age;

	@Override
	public int compareTo(Student o) {
		if(this.age > o.age){
			return 100;
		}else if(this.age < o.age){
			return -100;
		}
		return 0;
	}
	
}
