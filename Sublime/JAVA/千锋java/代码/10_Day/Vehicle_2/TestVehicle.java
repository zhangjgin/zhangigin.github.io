public class TestVehicle{
	public static void main(String[] args){
		
		Car car = new Car();
		car.type = "С����";
		car.speed = 120;
		car.price = 50;//��
		car.brand = "BMW";
		car.run();
		
		
		Bus bus = new Bus();
		bus.type = "������";
		bus.speed = 40;
		bus.price = 150;
		bus.seatNum = 16;
		bus.run();
	}
}

//��ͨ���ߣ�����
class Vehicle{
	String type;//���ͣ�С�����������������г���
	int speed;
	double price;

	public void run(){
		System.out.println("һ��" + type +"��" + speed +"/H���ٶ�ǰ��");
	}
}


class Car extends Vehicle{
	String brand;//Ʒ��
}

class Bus extends Vehicle{
	int seatNum;//��λ��
}

class Bicycle extends Vehicle{
	String color;//��ɫ
}