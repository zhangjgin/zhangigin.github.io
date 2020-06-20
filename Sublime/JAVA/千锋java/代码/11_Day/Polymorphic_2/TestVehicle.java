public class TestVehicle{
	public static void main(String[] args){
		/*
		Bus bus = new Bus();
		bus.type="公交车";
		bus.speed = 50;
		bus.price = 2000000.0;
		bus.seatNum = 16;

		Car car = new Car();
		car.type="小汽车";
		car.speed = 120;
		car.price = 5000000D;
		car.brand = "BMW";

		Bicycle bic = new Bicycle();
		bic.type="自行车";
		bic.speed = 30;
		bic.price = 2000D;
		bic.color = "红";
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
			System.out.println("小汽车的品牌是：" + car.brand);
		}else if(myVeh instanceof Bus){
			Bus bus = (Bus)myVeh;
			System.out.println("公交车的座位数量是：" + bus.seatNum);
		}else if(myVeh instanceof Bicycle){
			Bicycle bic = (Bicycle)myVeh;
			System.out.println("自行车的颜色是：" + bic.color);
		}
		
		System.out.println("程序结束");
	}
}

class Employee{
	
	String name;
	
	//回家
	public void goHome(Vehicle veh){// Vehicle veh = new Bus();
		System.out.print(name +"正在乘坐");
		veh.run();
	}
	
	//买
	public Vehicle buyVehicle(int money){//预算
	
		Vehicle myVehicle = null;
	
		if(money > 1000000){
			//买公交车
			Bus myBus = new Bus();//父类引用指向子类对象
			myBus.type = "公交车";
			myBus.speed = 70;
			myBus.price = 2000000D;
			myBus.seatNum = 20;
			myVehicle = myBus;
		}else if(money > 500000){
			//买小汽车
			myVehicle = new Car();//0x11223344
		}else if(money > 2000){
			//买自行车
			myVehicle = new Bicycle();
		}
		
		return myVehicle;//0x11223344
	}
	
	/*
	public void goHome(Bus bus){
		System.out.print(name +"正在乘坐");
		bus.run();
	}
	
	public void goHome(Car car){
		System.out.print(name +"正在乘坐");
		car.run();
	}
	
	public void goHome(Bicycle bic){
		System.out.print(name +"正在乘坐");
		bic.run();
	}
	
	public void goHome(Train train){
	
	}
	*/
	//100个goHome的方法
	
}


class Vehicle{
	String type;//小汽车、公交车、自行车
	int speed;//速度
	double price;//价格
	
	public void run(){
		System.out.println("一辆" + price +"的" + type +"正在以" + speed +"/H的速度前进...");
	}
}


class Car extends Vehicle{
	String brand;//品牌
	
	public void run(){
		System.out.println("一辆价值" + price +"的，"+ brand +"品牌的" + type +"正在以" + speed +"/H的速度前进...");
	}
}

class Bus extends Vehicle{
	int seatNum;//座位数
	
	public void run(){
		System.out.println("一辆价值" + price +"的，拥有" + seatNum +"个座位的" + type +"正在以" + speed +"/H的速度前进...");
	}
}

class Bicycle extends Vehicle{
	String color;//颜色
	
	public void run(){
		System.out.println("一辆价值" + price +"的，"+ color +"色的" + type +"正在以" + speed +"/H的速度前进...");
	}
}



class Train extends Vehicle{
	public void run(){
		System.out.println("");
	}
}