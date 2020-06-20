public class TestCallback{
	public static void main(String[] args){
		
		Student[] stus = new Student[]{new Student("����",98D) , new Student("����",99D) , new Student("����",97D)};

		java.util.Arrays.sort(stus);
		
		//sort(stus);
		
		for(int i = 0 ; i < stus.length ; i++){
			System.out.println(stus[i].name +"\t"+ stus[i].score);
		}
		
		/*
		int n = stus[0].compareTo(stus[1]);
		
		
		n == ����  	����һ���ȵڶ���С ��
		n == ��		��������ȣ�
		n == ����	����һ���ȵڶ�����
		*/
	}
	
	
	//ģ��Arrays.sort()һ���������
	public static void sort(Student[] students){//Ӳ��Ҫ�󣬱���ʵ��Comparable
		
		for(int i = 0 ; i < students.length - 1 ; i++){
			Comparable c = (Comparable)students[i];//������ʾ�������û��ʵ�ֽӿ�
			
			int n = c.compareTo(students[i+1]);//�ӿڵ�ʹ���ߣ�����
			
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

	//��Ϊ��ʹ��sort������ߣ�����Ҫ��ʵ����һ���ӿڣ������ǵ���һ������
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








