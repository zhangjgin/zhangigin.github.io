public class TestAddress{
	public static void main(String[] args){
		
		Address a1 = new Address();//0x6666
		a1.position = "北京市海淀区";
		a1.zipCode = "100000";
		
		
		
		Address a2 = new Address("北京市昌平区","100080");//0x7777
		
		
		
		
		
		Worker w1 = new Worker();
		w1.name = "Tom";
		w1.age = 25;
		w1.salary = 5000D;
		w1.addr = a1;//0x6666
		System.out.println(w1.name +"\t"+ w1.age +"\t"+ w1.salary +"\t"+ w1.addr.position +"\t"+ w1.addr.zipCode);
		
		
		
		Worker w2 = new Worker("Jack",26,6500D,a2);
		//w2.addr = a2;//0x7777
		System.out.println(w2.name +"\t"+ w2.age +"\t"+ w2.salary +"\t"+ w2.addr.position +"\t"+ w2.addr.zipCode);
		
		
	}
}



class Worker{
	String name;
	int age;
	double salary;
	Address addr;//家庭住址 = 0x11223344（代表一个Address对象）
	
	public Worker(){}
	
	public Worker(String name, int age , double salary , Address addr){//0x7777
		this.name = name;
		this.age = age;
		this.salary = salary;
		this.addr = addr;//0x7777
	}
}

class Address{
	String position;//地理位置
	String zipCode;//邮政编码
	
	public Address(){}
	
	public Address(String position , String zipCode){
		this.position = position;
		this.zipCode = zipCode;
	}
}