package maps;

import java.util.HashMap;
import java.util.Map;

public class TestTreeMap {

	public static void main(String[] args) {
		
		/*Map<String,String> map = new TreeMap<String,String>();
		
		map.put("CN","�л����񹲺͹�");
		map.put("US","��������ڹ�");
		map.put("KR","����");
		map.put("IT","�����");
		map.put("JP","�ձ�");
		
		//Set<String> keys = map.keySet();
		for (String key : map.keySet()) {
			System.out.println(key);
		}*/
		
		
		//ȫ�����ʱ������������ɳ�һ��ѧ������
		
		Map<Student,School> map = new HashMap<Student,School>();
		
		map.put(new Student("����"), new School("�����е�һ��ѧ"));
		
		map.put(new Student("����"), new School("�����е�ʮһ��ѧ"));
		
		//Oracle  ���ʼƻ�     ��ѯ���   --->  ����    Key:select * from xxx  Value:���ʼƻ�
		
		
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



