public class TestCar{
	public static void main(String[] args){
		
		Car c1 = new Car();//1234
		c1.breed = "����";
		
		c1.start();
		
		
		Car c2 = new Car();//5678
		c2.breed = "����";
		
		c2.start();
		
	}
}

//this = 1234
class Car{
	//ʵ������
	String breed;
	int speed;
	double price;
	String color;
	
	public void start(){
		System.out.println(breed +"һ������....");
		this.run();
	}
	
	public void run(){//ʵ������
		System.out.println(this.breed +"\t"+ this.speed +"\t"+ this.price +"\t"+ color);
	}
	
	
}