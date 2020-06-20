package reflects;

import java.io.Serializable;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class TestClassMethods {

	public static void main(String[] args) throws Exception {

		Class c = Class.forName("reflects.Teacher");
		
		//�������Ϣ�����ݣ�
		System.out.println(c.getName());//�������
		System.out.println(c.getPackage().getName());
		
		//��ø����Class����
		Class superClass = c.getSuperclass();
		System.out.println(superClass.getName());
		
		//������нӿڵ�Class����
		Class[] interfaces = c.getInterfaces();
		for (Class interfs : interfaces) {
			System.out.println(interfs.getName());
		}
		
		//��ȡ�������Ե�Field����
		Field[] fields = c.getFields();//��ȡ����+����Ĺ������Զ���
		
		for (Field field : fields) {
			System.out.println("getFields������" + field.getName());
		}
		
		System.out.println("---------------------------------------------");
		
		Field[] fields2 = c.getDeclaredFields();
		
		for (Field field : fields2) {
			System.out.println("getDeclaredFields������" + field.getName());
		}
		
		System.out.println("---------------------------------------------");
		
		Method[] methods = c.getMethods();
		
		for (Method method : methods) {
			System.out.println("getMethods��"+ method.getName());
		}
		
		System.out.println("---------------------------------------------");
		
		Method[] methods2 = c.getDeclaredMethods();
		
		for (Method method : methods2) {
			System.out.println("getDeclaredMethods"+method.getName());
		}
		
		Constructor[] cs = c.getConstructors();
		
		for (Constructor constructor : cs) {
			System.out.println(constructor.getName());
		}
	}
}

class Person {
	public Integer age;
	public String sex;
	
	public void eat(){}
	public void sleep(){}
}

class Teacher extends Person implements Serializable , Runnable , Comparable{

	public String name;
	public Double salary;
	String address;//��ͥסַ
	
	public Teacher(){}
	
	public Teacher(String name){}
	
	public Teacher(String name , Double salary){}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	private void aaa(){}
	
}