package chp9;

public class Worker {
	private String name;
	private int age;
	private double salary;
	public Worker(){}
	public Worker(String name, int age, double salary) {
		this.name = name;
		this.age = age;
		this.salary = salary;
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
	
	public String toString(){
		return name + " " + age + " " + salary;
	}
	
	public boolean equals(Object obj){
		if (obj == this) return true;
		if (obj == null) return false;
		if (this.getClass() != obj.getClass()) return false;
		Worker w = (Worker) obj;
		if (this.name.equals(w.name) 
				&& this.age == w.age
				&& this.salary == w.salary){
			return true;
		}else{
			return false;
		}
	}
	
}
