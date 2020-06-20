package objects;

public class TestEquals {

	public static void main(String[] args) {

		/*
		Object o = new Object();
		
		Object o2 = new Object();
		
		System.out.println(o.equals(o2));
		
		System.out.println(o == o2);//无法人为干预
		*/		
		
		
		//两个地址不同，而内容相同的对象（可以进行比较）
		Object s1 = new Student("tom",20,"男",99D);
		
		Object s2 = new Student(new String("tom"),20,"男",99D);
		
		System.out.println(s1 == s2);//false 表示两个对象的地址不同
		
		System.out.println(s1.equals(s2));//true 表示两个地址不同而内容相同的对象属于重复对象
		
		
		//情况1（自己和自己比）
		//s1.equals(s1);
		
		//情况2（自己和null比）
		//s1.equals(null);
		
		//情况3（自己和公交车比）
		//s1.equals(new Bus());
		
	}

}


//this ---> s1
class Student{
	String name;
	int age;
	String sex;
	double score;
	public Student(String name, int age, String sex, double score) {
		super();
		this.name = name;
		this.age = age;
		this.sex = sex;
		this.score = score;
	}
	

	@Override
	public boolean equals(Object obj){
		
		System.out.println("Executed");
		
		if(this == obj){
			 return true;
		}

		if(obj == null){
			return false;
		}
		
		
		if(this.getClass() != obj.getClass()){
			return false;
		}
		
		Student s = (Student)obj;
		
		
		//使用this的各个属性值与o的各个属性值一一进行比较，如果所有属性都全完相同，则代表二者相同
		if(this.name.equals(s.name)  && this.age == s.age && this.sex.equals(s.sex) && this.score == s.score){
			return true;
		}
		
		return false;
	}
}