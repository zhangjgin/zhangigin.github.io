package sets;

import java.util.TreeSet;

public class TestTreeSet {

	public static void main(String[] args) {
		
//		TreeSet<String> set = new TreeSet<String>();
//		
//		set.add("B");
//		set.add("A");
//		set.add("D");
//		set.add("C");
//		set.add("E");
//		
//		for(Object obj : set){
//			System.out.println(obj);
//		}
		
		//һ����󣬱����ǡ��ɱȽϵġ�������ʵ��java.lang.Comparable�ӿڣ�
		TreeSet<Teacher> students = new TreeSet<Teacher>();
		
		students.add(new Teacher("tom",25,"��",5000D));
		students.add(new Teacher("jack",25,"��",5000D));
		students.add(new Teacher("annie",25,"Ů",5000D));
		students.add(new Teacher("vicky",25,"Ů",5000D));
		students.add(new Teacher("rose",25,"Ů",5000D));
		students.add(new Teacher("abby",25,"Ů",5000D));
		students.add(new Teacher("eric",25,"��",5000D));
		
		
		students.add(new Teacher("jack",25,"��",5000D));
		students.add(new Teacher("annie",25,"Ů",5000D));
		
		
		
		for (Teacher t : students) {
			System.out.println(t);
		}
		
	}

}


class Teacher implements Comparable<Teacher>{
	String name;
	int age;
	String sex;
	Double salary;
	
	public Teacher(String name, int age, String sex, Double salary) {
		super();
		this.name = name;
		this.age = age;
		this.sex = sex;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Teacher [name=" + name + ", age=" + age + ", sex=" + sex
				+ ", salary=" + salary + "]";
	}



	@Override
	public int compareTo(Teacher o) {
		//���ʶ�Ŀ���
		if(this.salary > o.salary){
			return 1;
		}else if(this.salary < o.salary){
			return -1;
		}else{
			//�����Ŀ���
			if(this.age > o.age){
				return 1;
			}else if(this.age < o.age){
				return -1;
			}else{
				//˭����������ĸ��ѭ�ֵ�����
				if(this.name.compareTo(o.name) < 0){
					return -1;
				}else if(this.name.compareTo(o.name) > 0){
					return 1;
				}else{
					return this.sex.compareTo(o.sex);
				}
			}
		}
	}
}



