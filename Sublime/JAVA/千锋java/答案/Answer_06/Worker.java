package chp6;

public class Worker {
	private String name;//���˵�����
	private int age;//���˵�����
	private double salary;//���˵Ĺ���
	public Worker(String name, int age, double salary) {
		super();
		this.name = name;
		this.age = age;
		this.salary = salary;
	}
	public Worker() {
		super();
	}
	public void work(){
		
	}
	public void work(int time){
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
}
