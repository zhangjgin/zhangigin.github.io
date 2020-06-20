package objects;

public class TestEquals {

	public static void main(String[] args) {

		/*
		Object o = new Object();
		
		Object o2 = new Object();
		
		System.out.println(o.equals(o2));
		
		System.out.println(o == o2);//�޷���Ϊ��Ԥ
		*/		
		
		
		//������ַ��ͬ����������ͬ�Ķ��󣨿��Խ��бȽϣ�
		Object s1 = new Student("tom",20,"��",99D);
		
		Object s2 = new Student(new String("tom"),20,"��",99D);
		
		System.out.println(s1 == s2);//false ��ʾ��������ĵ�ַ��ͬ
		
		System.out.println(s1.equals(s2));//true ��ʾ������ַ��ͬ��������ͬ�Ķ��������ظ�����
		
		
		//���1���Լ����Լ��ȣ�
		//s1.equals(s1);
		
		//���2���Լ���null�ȣ�
		//s1.equals(null);
		
		//���3���Լ��͹������ȣ�
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
		
		
		//ʹ��this�ĸ�������ֵ��o�ĸ�������ֵһһ���бȽϣ�����������Զ�ȫ����ͬ������������ͬ
		if(this.name.equals(s.name)  && this.age == s.age && this.sex.equals(s.sex) && this.score == s.score){
			return true;
		}
		
		return false;
	}
}