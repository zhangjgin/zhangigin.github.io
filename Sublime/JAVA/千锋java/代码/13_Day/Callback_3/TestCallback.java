public class TestCallback{
	public static void main(String[] args){
		
		Student[] stus = new Student[]{new Student("张三",98D) , new Student("李四",99D) , new Student("王五",97D)};

		java.util.Arrays.sort(stus);
		
		//sort(stus);
		
		for(int i = 0 ; i < stus.length ; i++){
			System.out.println(stus[i].name +"\t"+ stus[i].score);
		}
		
		/*
		int n = stus[0].compareTo(stus[1]);
		
		
		n == 负数  	（第一个比第二个小 ）
		n == 零		（二者相等）
		n == 整数	（第一个比第二个大）
		*/
	}
	
	
	//模拟Arrays.sort()一组对象排序
	public static void sort(Student[] students){//硬性要求，必须实现Comparable
		
		for(int i = 0 ; i < students.length - 1 ; i++){
			Comparable c = (Comparable)students[i];//报错，表示该组对象，没有实现接口
			
			int n = c.compareTo(students[i+1]);//接口的使用者（抽象）
			
			if(n > 0){
				Student temp = students[i];
				students[i] = students[i+1];
				students[i+1] = temp;
			}
		}
	}

}


interface UserOperation{
	public User login(String username , String password);
	public boolean register(User user);
	public boolean cancel();
}


class Student implements Comparable<Student>{
	String name;
	int age;
	String sex;
	double score;

	public Student(String name , double score){
		this.name = name;
		this.score = score;
	}

	//我为了使用sort这个工具，被迫要求实现了一个接口，并覆盖的了一个方法
	public int compareTo(Student s){
		if(this.score > s.score){
			return -1;
		}else if(this.score < s.score){
			return 1;
		}else{
			return this.age - s.score;
		}
	}
}








