public class TestVehicle{
	public static void main(String[] args){
		/*
		Bus bus = new Bus();
		bus.type="������";
		bus.speed = 50;
		bus.price = 2000000.0;
		bus.seatNum = 16;

		Car car = new Car();
		car.type="С����";
		car.speed = 120;
		car.price = 5000000D;
		car.brand = "BMW";

		Bicycle bic = new Bicycle();
		bic.type="���г�";
		bic.speed = 30;
		bic.price = 2000D;
		bic.color = "��";
		*/
		
		
		Employee emp = new Employee();
		emp.name = "tom";
		
		
		Vehicle myVeh = emp.buyVehicle(300);//new Bus() //0x11223344
		
		if(myVeh != null){
			emp.goHome(myVeh);
		}
		
		
		//Bus bus = (Bus)myVeh;
		
		//System.out.println(bus.seatNum);
		
		
		if(myVeh instanceof Car){
			Car car = (Car)myVeh;
			System.out.println("С������Ʒ���ǣ�" + car.brand);
		}else if(myVeh instanceof Bus){
			Bus bus = (Bus)myVeh;
			System.out.println("����������λ�����ǣ�" + bus.seatNum);
		}else if(myVeh instanceof Bicycle){
			Bicycle bic = (Bicycle)myVeh;
			System.out.println("���г�����ɫ�ǣ�" + bic.color);
		}
		
		System.out.println("�������");
	}
}

class Employee{
	
	String name;
	
	//�ؼ�
	public void goHome(Vehicle veh){// Vehicle veh = new Bus();
		System.out.print(name +"���ڳ���");
		veh.run();
	}
	
	//��
	public Vehicle buyVehicle(int money){//Ԥ��
	
		Vehicle myVehicle = null;
	
		if(money > 1000000){
			//�򹫽���
			Bus myBus = new Bus();//��������ָ���������
			myBus.type = "������";
			myBus.speed = 70;
			myBus.price = 2000000D;
			myBus.seatNum = 20;
			myVehicle = myBus;
		}else if(money > 500000){
			//��С����
			myVehicle = new Car();//0x11223344
		}else if(money > 2000){
			//�����г�
			myVehicle = new Bicycle();
		}
		
		return myVehicle;//0x11223344
	}
	
	/*
	public void goHome(Bus bus){
		System.out.print(name +"���ڳ���");
		bus.run();
	}
	
	public void goHome(Car car){
		System.out.print(name +"���ڳ���");
		car.run();
	}
	
	public void goHome(Bicycle bic){
		System.out.print(name +"���ڳ���");
		bic.run();
	}
	
	public void goHome(Train train){
	
	}
	*/
	//100��goHome�ķ���
	
}


class Vehicle{
	String type;//С�����������������г�
	int speed;//�ٶ�
	double price;//�۸�
	
	public void run(){
		System.out.println("һ��" + price +"��" + type +"������" + speed +"/H���ٶ�ǰ��...");
	}
}


class Car extends Vehicle{
	String brand;//Ʒ��
	
	public void run(){
		System.out.println("һ����ֵ" + price +"�ģ�"+ brand +"Ʒ�Ƶ�" + type +"������" + speed +"/H���ٶ�ǰ��...");
	}
}

class Bus extends Vehicle{
	int seatNum;//��λ��
	
	public void run(){
		System.out.println("һ����ֵ" + price +"�ģ�ӵ��" + seatNum +"����λ��" + type +"������" + speed +"/H���ٶ�ǰ��...");
	}
}

class Bicycle extends Vehicle{
	String color;//��ɫ
	
	public void run(){
		System.out.println("һ����ֵ" + price +"�ģ�"+ color +"ɫ��" + type +"������" + speed +"/H���ٶ�ǰ��...");
	}
}



class Train extends Vehicle{
	public void run(){
		System.out.println("");
	}
}