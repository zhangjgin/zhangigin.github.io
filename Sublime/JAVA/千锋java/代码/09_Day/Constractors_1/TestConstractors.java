public class TestConstractors{
	public static void main(String[] args){
		Student s1 = new Student();//逻辑第4行（创建局部变量，并保存地址）
		
		s1.name = "tom";
		s1.age = 30;
		s1.sex = "男";
		s1.score = 100D;
		
		System.out.println(s1.name +"\t"+ s1.age +"\t"+ s1.sex +"\t"+ s1.score);
	}
}

class Student{
	String name;//默认值
	int age = 20;//初始值
	String sex;
	double score;
	
	//无参构造方法
	public Student(){
		//逻辑第1行（对属性进行初始化）
		//逻辑第2行（执行构造方法中的代码）
		System.out.println("Student()" + age);
	}//逻辑第3行（回到构造方法的调用位置）
	
	public void sayHi(){}
	public void study(){}
	public void exam(){}
}