public class TestVisitor{
	public static void main(String[] args){
		
		Student stu = new Student();
		
		stu.name = "tom";
		//stu.age = 20;//Error ����ֱ�ӷ���˽������
		
		stu.setAge(20000);

		stu.setSex("��Ů��Ů");
		
		stu.score = 99D;
		
		//���stu�����age���Ե�ֵ
		System.out.println( stu.getAge() );
		
		System.out.println( stu.getSex() );
		
	}
}


class Student{
	String name;
	private int age;//˽�����ԣ�����ɼ���
	private String sex;
	double score;

	public void setAge(int age){
		if(age > 0 && age <= 253){
			this.age = age;
		}else{
			//Future:�׳��쳣
			this.age = 18;
		}
	}
	
	public int getAge(){
		return this.age;
	}
	
	
	
	public void setSex(String sex){//NullPointerException
		if("��".equals(sex) || "Ů".equals(sex) ){
			this.sex = sex;
		}else{
			this.sex = "��";
		}
	}
	
	public String getSex(){
		return this.sex;
	}
	
}