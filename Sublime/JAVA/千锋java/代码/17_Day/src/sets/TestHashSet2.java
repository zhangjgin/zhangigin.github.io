package sets;

import java.util.HashSet;

public class TestHashSet2 {

	public static void main(String[] args) {

		Student s1 = new Student("tom",20,"男",99D);
		Student s2 = new Student("jack",21,"男",97D);
		Student s3 = new Student("marry",20,"女",99D);
		Student s4 = new Student("annie",21,"女",100D);
		Student s5 = new Student("tom",20,"男",99D);
		
		HashSet<Student> students = new HashSet<Student>();
		
		students.add(s1);
		students.add(s2);
		students.add(s3);
		students.add(s4);
		//students.add(s1);//插入重复对象（地址重复）
		students.add(s5);//插入重复对象（地址不同、内容相同）
		
		for (Student stu : students) {
			System.out.println(stu);
			//System.out.println(stu.name.hashCode() +"\t"+ stu.age.hashCode() +"\t"+ stu.sex.hashCode() +"\t"+ stu.score.hashCode());
		}
		
		//System.out.println(s1.equals(s5));
		
	}

}

class Student{
	String name;
	Integer age;
	String sex;
	Double score;
	public Student() {
		super();
	}
	public Student(String name, Integer age, String sex, Double score) {
		super();
		this.name = name;
		this.age = age;
		this.sex = sex;
		this.score = score;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", sex=" + sex + ", score=" + score + "] " + this.hashCode();
	}
	
	@Override
	public int hashCode() {
		return this.name.hashCode() + this.age + this.sex.hashCode() + this.score.hashCode();
	}
	
	
	
	//触发条件：两个对象的哈希码相同，才执行equals
	@Override
	public boolean equals(Object obj) {
		
		System.out.println("---Student equals() Exected---");
		
		if(this == obj) return true;
		
		if(obj == null) return false;
		
		if(this.getClass() != obj.getClass()) return false;
		
		Student s = (Student)obj;

		if(this.name.equals(s.name) && this.age.equals(s.age) && this.sex.equals(s.sex) && this.score.equals(s.score))
			return true;
			
		return false;
	}
	
	
	
}