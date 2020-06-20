package invokes;

import java.lang.reflect.Method;

public class TestInvokeMethods {

	public static void main(String[] args) throws Exception {
		
		//通过工厂创建了一个类（Student）的对象
		Object stu = objectFactory("invokes.Student");

		//通过学生对象获得了所属的类对象（Class ---> invokes.Student）
		Class c = stu.getClass();
		
		//通过类对象获得了其中的一个方法（study方法、无参）
		Method m = c.getMethod("study",null);
		
		//通过invoke，让study实例方法执行起来，所需的对象，作为第一个参数，所需的方法调用实参，作为第二个参数
		m.invoke( stu , null);//stu.study();
		
		//----------------------------------------------------------------------------------
		
		Method m2 = c.getMethod("study", int.class);
		
		m2.invoke(stu, 111);
		
		//----------------------------------------------------------------------------------
		
		Method m3 = c.getMethod("exam" , int.class , double.class);
		
		m3.invoke(stu, 111 , 2.3 );
		
		//----------------------------------------------------------------------------------
		
		Method m4 = c.getDeclaredMethod("calc", null);

		//注意：反射是一种Java的底层技术，可以突破封装
		m4.setAccessible(true);
		
		m4.invoke(stu, null);
	}
	
	//工厂
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