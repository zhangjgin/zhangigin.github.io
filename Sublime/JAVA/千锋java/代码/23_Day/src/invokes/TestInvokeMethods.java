package invokes;

import java.lang.reflect.Method;

public class TestInvokeMethods {

	public static void main(String[] args) throws Exception {
		
		//ͨ������������һ���ࣨStudent���Ķ���
		Object stu = objectFactory("invokes.Student");

		//ͨ��ѧ���������������������Class ---> invokes.Student��
		Class c = stu.getClass();
		
		//ͨ��������������е�һ��������study�������޲Σ�
		Method m = c.getMethod("study",null);
		
		//ͨ��invoke����studyʵ������ִ������������Ķ�����Ϊ��һ������������ķ�������ʵ�Σ���Ϊ�ڶ�������
		m.invoke( stu , null);//stu.study();
		
		//----------------------------------------------------------------------------------
		
		Method m2 = c.getMethod("study", int.class);
		
		m2.invoke(stu, 111);
		
		//----------------------------------------------------------------------------------
		
		Method m3 = c.getMethod("exam" , int.class , double.class);
		
		m3.invoke(stu, 111 , 2.3 );
		
		//----------------------------------------------------------------------------------
		
		Method m4 = c.getDeclaredMethod("calc", null);

		//ע�⣺������һ��Java�ĵײ㼼��������ͻ�Ʒ�װ
		m4.setAccessible(true);
		
		m4.invoke(stu, null);
	}
	
	//����
	public static Object objectFactory(String className){
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
		System.out.println("study() Executed");
	}
	
	public int study(int a){
		System.out.println("study(int a) Executed");
		return 0;
	}
	
	public Double exam(int a , double b){
		System.out.println("exam(int a , double b) Executed");
		calc();
		return score;
	}
	
	private void calc(){
		System.out.println("calc() Executed");
	}
}