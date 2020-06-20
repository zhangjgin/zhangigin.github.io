public class TestOOP{
	public static void main(String[] args){
		
		Student s1 = new Student();
		s1.name = "tom";
		s1.score = 98.5;
		
		Student s2 = new Student();
		s2.name="jack";
		s2.score = 99D;
		
		Student s3 = new Student();
		s3.name="marry";
		s3.score = 60.0;
		
		Student s4 = new Student();
		s4.name="vicky";
		s4.score = 95D;
		
		s1.sayHi();
		s2.sayHi();
		s3.sayHi();
		s4.sayHi();
		
		
		Teacher t1 = new Teacher();
		
		t1.name="aaron";
		t1.age = 18;
		t1.sex = "��";
		t1.salary = 5000.0;
		
		
		//double result = t1.calcScore(s1.score , s2.score , s3.score , s4.score );
		
		String[] names = new String[]{ s1.name , s2.name , s3.name , s4.name};
		
		double[] scores = new double[]{ s1.score , s2.score , s3.score , s4.score };
		
		
		
		
		double result = t1.calcScore( names , scores);
		
		System.out.println(result);
		
	}
}



class Student{
	
	String name;
	int age;
	String sex;
	double score;
	
	public void sayHi(){
		System.out.println("��Һã�����" + name +"������" + age +"�꣬�Ա�"
							+ sex +"���˴ο��Գɼ�Ϊ��" + score);
	}
}


class Teacher{
	String name;
	int age;
	String sex;
	double salary;//����
	
	public double calcScore(double... scores){
		System.out.println("calcScore(double... scores)");
		double sum = 0D;
		for(int i = 0 ; i < scores.length ; i++){
			sum += scores[i];
		}
		return sum;
	}
	
	public double calcScore(String[] names , double... scores){
		System.out.println("calcScore(double... scores)");
		double sum = 0D;
		double max = scores[0];
		int index = 0;
		for(int i = 0 ; i < scores.length ; i++){
			sum += scores[i];
			if(scores[i] > max){
				max = scores[i];
				index = i;
			}
		}
		
		System.out.println("��߷ֵ�ͬѧ���ƣ�" + names[index]);
		
		return sum;
	}
	
	//ͳ�ƶ���ѧ�����ܳɼ���������
	//public double calcScore(double a , double b , double c , double d){
	//	System.out.println("calcScore(double a , double b , double c , double d)");
	//	return a + b + c + d;
	//}
	
	//public double calcScore(double[] scores){
	//	double sum = 0D;
	//	for(int i = 0 ; i < scores.length ; i++){
	//		sum += scores[i];
	//	}
	//	return sum;
	//}
	
	
	
}





