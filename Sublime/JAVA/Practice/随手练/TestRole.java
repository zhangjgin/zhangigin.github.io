abstract class Role{
	private String name;
	private int age;
	private String gender;

	public Role(){
	}
	public Role(String name,int age){
		this.name = name;
		this.age = age;
	}
	public Role(String name,int age,String gender){
		this(name,age);
		this.gender = gender;
	}

	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return name;
	}
	public void setAge(int age){
		this.name = name;
	}
	public int getAge(){
		return age;
	}
	public void setGender(String gender){
		this.gender = gender;
	}
	public String getGender(){
		return gender;
	}
	public abstract void play();
}



class Employee extends Role{
	static int id;
	private int salary;

	public Employee(){
}
	public Employee(String name,int age,String gender,int salary){
		super(name,age,gender);
		this.salary = salary;
	}
	public void setSalary(int salary){
		this.salary = salary;
	}
	public int getSalary(){
		return salary;
	}
	public void play(){
		System.out.println("员工回家打老婆");
	}
	public final void sing(){
		System.out.println("陪老板唱歌");
	}
	public void info(){
		System.out.println("工号：" + id + "   姓名：" + getName() + "   年龄：" + getAge() + "   性别：" + getGender() + "   薪资：" + salary);
	}
}


class Manager extends Employee{
	final String vehicle;
	public Manager(String name,int age,String gender,int salary,String vehicle){
	super(name,age,gender,salary);
	this.vehicle = vehicle;
	}
}



public class TestRole{
	public static void main(String[] args){
		Employee e = new Employee("靖哥",28,"男",90000);
		e.id++;
		e.info();
		e.sing();
		e.play();
	}
}