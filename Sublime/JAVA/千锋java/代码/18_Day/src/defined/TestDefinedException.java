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
			s.setSex("啊啊");
		} catch (Exception e) {
			System.err.println("性别输入有误 " + e.getMessage());
		}
		
	}

}

//受查异常
class AgeException extends Exception{

	public AgeException() {
		super();
	}

	public AgeException(String message) {
		super(message);
	}
	
}

//运行时异常
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
			//抛异常
			throw new AgeException("年龄的正确区间为1 ~ 253");
		}
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		if(sex.equals("男") || sex.equals("女")){
			this.sex = sex;
		}else{
			//抛异常
			throw new SexMismatchException("性别的正确取值为：“男”或者“女”");
		}
	}
	
	
}


