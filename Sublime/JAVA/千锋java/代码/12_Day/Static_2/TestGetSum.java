public class TestGetSum{
	public static void main(String[] args){
		
		Student s1 = new Student();
		
		Student s2 = new Student();
		
		Student s3 = new Student();
		
		System.out.println(Student.count);
		
		Student.method();
		
		
		//��̬����
		Math.random();//���һ������� > 0 < 1
		
		
		java.util.Random random = new java.util.Random();
		
		//ʵ������
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
	
	//ʵ��
	public static void method(){
		System.out.println("xxx");
	}
}