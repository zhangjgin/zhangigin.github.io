package factory;

public class TestReflectNewInstance {
	public static void main(String[] args) throws InstantiationException, IllegalAccessException {
		
		/*
		//ʹ���ֹ�����ʽnew����
		Student s = new Student();
		s.name = "tom";
		
		System.out.println(s.name);
		
		//ʹ�÷��䴴����Ķ���
		Class c = Student.class;
		
		Student s2 = (Student)c.newInstance();
		s2.name = "jack";
		
		System.out.println(s2.name);
		*/
		
		Object o = createObject("used.Student");
		System.out.println(o);
	}
	
	
	public static Object createObject(String className){
		try {
			Class c = Class.forName(className);
			return c.newInstance();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
}


class Student{
	String name;
	Integer age;
	String sex;
	Double score;
	
	public Student(){}
	
	public Student(String name, Integer age, String sex, Double score) {
		super();
		this.name = name;
		this.age = age;
		this.sex = sex;
		this.score = score;
	}

	public void study(){
		System.out.println("��Һã�����"+name);
	}
	
	public Double exam(){
		System.out.println("����...");
		calc();
		return score;
	}
	
	private void calc(){
		System.out.println("����...");
	}
}