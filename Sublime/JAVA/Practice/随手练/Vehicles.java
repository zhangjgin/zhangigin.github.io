public class Vehicles{
	String brand;	
	String color;
	
	public void run (){
		System.out.println("���ѽ�������");
	}
	public void showInfo(){		System.out.println("Ʒ�ƣ�" + brand +  "��ɫ��" + color);
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
		System.out.println("Ʒ�ƣ�" + brand + "��ɫ��" + color +"��λ��" + seats);
	}
}
class Test{
	public static void main(String[] args){
		Vehicles v = new Vehicles();
		v.brand = "BMW";
		v.color = "��ɫ";
		v.run();
		v.showInfo();
		Car c = new Car("����","��ɫ",5);
		c.showCar();
	}
}