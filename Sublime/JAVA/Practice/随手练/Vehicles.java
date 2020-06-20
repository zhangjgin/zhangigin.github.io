public class Vehicles{
	String brand;	
	String color;
	
	public void run (){
		System.out.println("我已近启动了");
	}
	public void showInfo(){		System.out.println("品牌：" + brand +  "颜色：" + color);
	}
}
class Car extends Vehicles{
	int seats;
	public Car(String brand,String color,int seats){
		this.brand = brand;
		this.color = color;
		this.seats = seats;
	}
	public void showCar(){
		System.out.println("品牌：" + brand + "颜色：" + color +"座位：" + seats);
	}
}
class Test{
	public static void main(String[] args){
		Vehicles v = new Vehicles();
		v.brand = "BMW";
		v.color = "白色";
		v.run();
		v.showInfo();
		Car c = new Car("奔驰","黑色",5);
		c.showCar();
	}
}