package objects;

public class TestHashCode {

	public static void main(String[] args) {
		//for (int i = 0; i < 5; i++) {
			//Object o = new Teacher("ÕÅÈý" , 1+i);
//			System.out.println(o.getClass().getName());
			//System.out.println(o.hashCode() +"\t"+ Integer.toHexString(o.hashCode()) );
		//	System.out.println(o.toString());
		
	
		Teacher t = new Teacher("tom",20,"ÄÐ",3000D);
	
		System.out.println(t);//t.toString()
	
	}
	
}

class Teacher{
	
	String name;
	int age;
	String sex;
	double salary;
	
	public Teacher(String name, int age, String sex, double salary) {
		super();
		this.name = name;
		this.age = age;
		this.sex = sex;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Teacher [name=" + name + ", age=" + age + ", sex=" + sex + ", salary=" + salary + "]";
	}

	/*public String toString(){

		//return this.getClass().getName() +"#"+ Integer.toHexString(this.hashCode());
		
		return this.name +"\t"+ this.age +"\t"+ this.sex +"\t"+ this.salary;
	}*/
	
}