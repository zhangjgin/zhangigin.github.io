package defined;

public class TestDefinedException {

	public static void main(String[] args) {
		
		Student s = new Student();
		
		try {
			s.setAge(1111);
		} catch (AgeException e) {
			e.printStackTrace();
		}
		
		
		try {
			s.setSex("����");
		} catch (Exception e) {
			System.err.println("�Ա��������� " + e.getMessage());
		}
		
	}

}

//�ܲ��쳣
class AgeException extends Exception{

	public AgeException() {
		super();
	}

	public AgeException(String message) {
		super(message);
	}
	
}

//����ʱ�쳣
class SexMismatchException extends RuntimeException{
	
	public SexMismatchException(){
		super();
	}
	
	public SexMismatchException(String message){
		super(message);
	}
}

class Student{
	private int age;
	private String sex;
	public int getAge() {
		return age;
	}
	public void setAge(int age) throws AgeException{
		if(age > 0 && age <= 253){
			this.age = age;
		}else{
			//���쳣
			throw new AgeException("�������ȷ����Ϊ1 ~ 253");
		}
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		if(sex.equals("��") || sex.equals("Ů")){
			this.sex = sex;
		}else{
			//���쳣
			throw new SexMismatchException("�Ա����ȷȡֵΪ�����С����ߡ�Ů��");
		}
	}
	
	
}


