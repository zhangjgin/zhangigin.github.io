package exam;

public class TestEqualsOverride {

	public static void main(String[] args) {

		Worker w1 = new Worker("tom",30,2000D);
		Worker w2 = new Worker("tom",30,2000D);
		
		System.out.println(w1.equals(w2));
		
	}

}

class Worker{
	private String name;
	private Integer age;
	private Double salary;
	
	public Worker() {
		super();
	}
	
	public Worker(String name, Integer age, Double salary) {
		super();
		this.name = name;
		this.age = age;
		this.salary = salary;
	}


	@Override
	public boolean equals(Object obj) {
		
		if(this == obj){
			return true;
		}
		
		if(obj == null){
			return false;
		}

		if(this.getClass() != obj.getClass()){
			return false;
		}
		
		Worker w = (Worker)obj;
		
		if(this.name.equals(w.name) && this.age.equals(w.age) && this.salary.equals(w.salary)){
			return true;
		}
		
		return false;
	}

	

	@Override
	public String toString() {
		return "Worker [name=" + name + ", age=" + age + ", salary=" + salary + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}
}