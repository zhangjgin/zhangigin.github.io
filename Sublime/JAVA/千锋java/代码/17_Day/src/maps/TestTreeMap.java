package maps;

import java.util.HashMap;
import java.util.Map;

public class TestTreeMap {

	public static void main(String[] args) {
		
		/*Map<String,String> map = new TreeMap<String,String>();
		
		map.put("CN","中华人民共和国");
		map.put("US","美利坚合众国");
		map.put("KR","韩国");
		map.put("IT","意大利");
		map.put("JP","日本");
		
		//Set<String> keys = map.keySet();
		for (String key : map.keySet()) {
			System.out.println(key);
		}*/
		
		
		//全国性质比赛（各个市派出一名学生代表）
		
		Map<Student,School> map = new HashMap<Student,School>();
		
		map.put(new Student("张三"), new School("北京市第一中学"));
		
		map.put(new Student("李四"), new School("北京市第十一中学"));
		
		//Oracle  访问计划     查询语句   --->  缓存    Key:select * from xxx  Value:访问计划
		
		
	}
}

class Student implements Comparable<Student>{
	public Student(String string) {
		// TODO Auto-generated constructor stub
	}

	@Override
	public int compareTo(Student o) {
		return 0;
	}
}

class School{
	public School(String string) {
		// TODO Auto-generated constructor stub
	}
}


class TreeSet<E>{
	
	private TreeMap<E,?> map;
	
	
	public void add(E e){
		map.put(e , null);
	}
	
}

class TreeMap<K,V>{
	
	public void put(K k , V v){
		
	}
}



