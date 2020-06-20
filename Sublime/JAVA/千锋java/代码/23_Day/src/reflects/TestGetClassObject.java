package reflects;

/**
 * ��ȡClass����Ķ��ַ�ʽ
 */
public class TestGetClassObject {

	public static void main(String[] args) throws ClassNotFoundException {

		//1.ͨ����Ķ��󣬻�ȡClass����
		Student s1 = new Student();//��Ķ���
		Class c1 = s1.getClass();//�����Class���󣬱�����Student.class����ļ���������Ϣ��
		System.out.println(c1.getName());
		
		//2.ͨ��������ȡ�����
		Class c2 = Dog.class;
		System.out.println(c2.getName());
		
		//3.ͨ����̬������ȡ�����
		Class c3 = Class.forName("reflects.Teacher");
		System.out.println(c3.getName());
	}
	
	//��������Class����
	public static void getClassObject(String className){
		try {
			Class c = Class.forName(className);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}

class Student{
	/**
	 * �������η���ʲô��
	 * �߼�������ʲô��
	 * ������ʲô���͵ģ�����������
	 */
	public Student(){}
}



class Dog{}