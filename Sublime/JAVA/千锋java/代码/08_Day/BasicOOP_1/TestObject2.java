public class TestObject2{
	public static void main(String[] args){
		
		
		
		
		
		Student s1;
		
		s1 = new Student();//创建对象
		
		
		s1.name = "寇广伟";
		s1.sex = "男";
		s1.age = 22;
		s1.score = 90.0;
		
		s1.study();
		s1.exam();
		s1.sleep(1);
		
		//--------------------------------------
	
		Student s2 = new Student();
		
		s2.name = "杨捷";
		s2.sex = "男";
		s2.age = 20;
		s2.score = 95.0;
		
		
		s2.study();
		s2.exam();
		s2.sleep(8);
		
		
		s1.score += 2.0;
	}
}




//姓名、性别、年龄、成绩

class Student{
	String name;
	String sex;
	int age;
	double score;
	int hour = 5;
	

	
	//学习
	public void study(){
		System.out.println(name + "敲半小时代码....");
	}
	
	//考试
	public void exam(){
		System.out.println( (int)(Math.random() * 100) );
	}
	
	public void sleep(int hour){//局部变量优先
		System.out.println("休息"+hour+"小时");
	}
}