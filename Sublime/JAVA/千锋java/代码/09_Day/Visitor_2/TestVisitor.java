public class TestVisitor{
	public static void main(String[] args){
		
		Student stu = new Student();
		
		stu.name = "tom";
		//stu.age = 20;//Error 不能直接访问私有属性
		
		stu.setAge(20000);

		stu.setSex("男女男女");
		
		stu.score = 99D;
		
		//获得stu对象的age属性的值
		System.out.println( stu.getAge() );
		
		System.out.println( stu.getSex() );
		
	}
}


class Student{
	String name;
	private int age;//私有属性（本类可见）
	private String sex;
	double score;

	public void setAge(int age){
		if(age > 0 && age <= 253){
			this.age = age;
		}else{
			//Future:抛出异常
			this.age = 18;
		}
	}
	
	public int getAge(){
		return this.age;
	}
	
	
	
	public void setSex(String sex){//NullPointerException
		if("男".equals(sex) || "女".equals(sex) ){
			this.sex = sex;
		}else{
			this.sex = "男";
		}
	}
	
	public String getSex(){
		return this.sex;
	}
	
}