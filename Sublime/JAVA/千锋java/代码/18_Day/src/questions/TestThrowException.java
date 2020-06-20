package questions;

public class TestThrowException {

	public static void main(String[] args) {

		Student s = new Student();
		
		s.setAge(300);
		
		System.out.println(s.getAge());
		
	}

	
}


class Student{
	private int age;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if(age > 0 && age <253){
			this.age = age;
		}else{
			RuntimeException e = new RuntimeException();//此刻仅仅是个普通对象
			throw e;
			//throw new RuntimeException();
		}
	}
	
	
}