public class TestVehicle{
	public static void main(String[] args){
		
		Car car = new Car();
		car.type = "小汽车";
		car.speed = 120;
		car.price = 50;//万
		car.brand = "BMW";
		car.run();
		
		
		Bus bus = new Bus();
		bus.type = "公交车";
		bus.speed = 40;
		bus.price = 150;
		bus.seatNum = 16;
		bus.run();
	}
}

//交通工具：父类
class Vehicle{
	String type;//类型（小汽车、公交车、自行车）
	int speed;
	double price;

	public void run(){
		System.out.println("一辆" + type +"以" + speed +"/H的速度前进");
	}
}


class Car extends Vehicle{
	String brand;//品牌
}

class Bus extends Vehicle{
	int seatNum;//座位数
}

class Bicycle extends Vehicle{
	String color;//颜色
}