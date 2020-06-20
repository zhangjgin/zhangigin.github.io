package reflects;

/**
 * 获取Class对象的多种方式
 */
public class TestGetClassObject {

	public static void main(String[] args) throws ClassNotFoundException {

		//1.通过类的对象，获取Class对象
		Student s1 = new Student();//类的对象
		Class c1 = s1.getClass();//类对象（Class对象，保存了Student.class这个文件的所有信息）
		System.out.println(c1.getName());
		
		//2.通过类名获取类对象
		Class c2 = Dog.class;
		System.out.println(c2.getName());
		
		//3.通过静态方法获取类对象
		Class c3 = Class.forName("reflects.Teacher");
		System.out.println(c3.getName());
	}
	
	//获得类对象（Class对象）
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
	 * 访问修饰符是什么？
	 * 逻辑代码是什么？
	 * 参数是什么类型的，参数的名字
	 */
	public Student(){}
}



class Dog{}