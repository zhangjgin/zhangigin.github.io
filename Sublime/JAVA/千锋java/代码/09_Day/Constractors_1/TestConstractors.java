public class TestConstractors{
	public static void main(String[] args){
		Student s1 = new Student();//�߼���4�У������ֲ��������������ַ��
		
		s1.name = "tom";
		s1.age = 30;
		s1.sex = "��";
		s1.score = 100D;
		
		System.out.println(s1.name +"\t"+ s1.age +"\t"+ s1.sex +"\t"+ s1.score);
	}
}

class Student{
	String name;//Ĭ��ֵ
	int age = 20;//��ʼֵ
	String sex;
	double score;
	
	//�޲ι��췽��
	public Student(){
		//�߼���1�У������Խ��г�ʼ����
		//�߼���2�У�ִ�й��췽���еĴ��룩
		System.out.println("Student()" + age);
	}//�߼���3�У��ص����췽���ĵ���λ�ã�
	
	public void sayHi(){}
	public void study(){}
	public void exam(){}
}