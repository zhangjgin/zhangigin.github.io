public class TestObject2{
	public static void main(String[] args){
		
		
		
		
		
		Student s1;
		
		s1 = new Student();//��������
		
		
		s1.name = "�ܹ�ΰ";
		s1.sex = "��";
		s1.age = 22;
		s1.score = 90.0;
		
		s1.study();
		s1.exam();
		s1.sleep(1);
		
		//--------------------------------------
	
		Student s2 = new Student();
		
		s2.name = "���";
		s2.sex = "��";
		s2.age = 20;
		s2.score = 95.0;
		
		
		s2.study();
		s2.exam();
		s2.sleep(8);
		
		
		s1.score += 2.0;
	}
}




//�������Ա����䡢�ɼ�

class Student{
	String name;
	String sex;
	int age;
	double score;
	int hour = 5;
	

	
	//ѧϰ
	public void study(){
		System.out.println(name + "�ð�Сʱ����....");
	}
	
	//����
	public void exam(){
		System.out.println( (int)(Math.random() * 100) );
	}
	
	public void sleep(int hour){//�ֲ���������
		System.out.println("��Ϣ"+hour+"Сʱ");
	}
}