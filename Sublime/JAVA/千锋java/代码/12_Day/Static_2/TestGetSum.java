public class TestGetSum{
	public static void main(String[] args){
		
		Student s1 = new Student();
		
		Student s2 = new Student();
		
		Student s3 = new Student();
		
		System.out.println(Student.count);
		
		Student.method();
		
		
		//静态方法
		Math.random();//获得一个随机数 > 0 < 1
		
		
		java.util.Random random = new java.util.Random();
		
		//实例方法
		random.nextInt(5);//0~4
		
		
		java.util.Random random2 = new java.util.Random();
		
		random2.nextInt(6);
	}
}

class Student{
	
	static int count = 0;
	
	public Student(){
		count++;
	}
	
	public void study(){
		
	}
	
	public void exam(){
		
	}
	
	//实例
	public static void method(){
		System.out.println("xxx");
	}
}