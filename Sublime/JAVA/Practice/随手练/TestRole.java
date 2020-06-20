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
		System.out.println("Ա���ؼҴ�����");
	}
	public final void sing(){
		System.out.println("���ϰ峪��");
	}
	public void info(){
		System.out.println("���ţ�" + id + "   ������" + getName() + "   ���䣺" + getAge() + "   �Ա�" + getGender() + "   н�ʣ�" + salary);
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
		Employee e = new Employee("����",28,"��",90000);
		e.id++;
		e.info();
		e.sing();
		e.play();
	}
}