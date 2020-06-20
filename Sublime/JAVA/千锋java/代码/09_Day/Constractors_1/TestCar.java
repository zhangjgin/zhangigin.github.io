public class TestCar{
	public static void main(String[] args){
		
		Car c1 = new Car();//1234
		c1.breed = "奔驰";
		
		c1.start();
		
		
		Car c2 = new Car();//5678
		c2.breed = "宝马";
		
		c2.start();
		
	}
}

//this = 1234
class Car{
	//实例变量
	String breed;
	int speed;
	double price;
	String color;
	
	public void start(){
		System.out.println(breed +"一键启动....");
		this.run();
	}
	
	public void run(){//实例方法
		System.out.println(this.breed +"\t"+ this.speed +"\t"+ this.price +"\t"+ color);
	}
	
	
}