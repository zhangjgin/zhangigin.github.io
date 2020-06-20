public class TestUSB{
	public static void main(String[] args){
		
		//程序猿
		
		
		Computer c1 = new Computer();
		
		
		c1.on(new Fan() , new Lamp() , new UDisk() );//使用工具
		
	}
}
class Computer{//工具
	
	USB u1;
	USB u2;
	USB u3;
	
	public void on(USB u1 , USB u2 , USB u3){
		this.u1 = u1;
		this.u2 = u2;
		this.u3 = u3;
		
		System.out.println("开机，进入操作页面...");
		
		//接口的使用者
		u1.service();
		u2.service();
		u3.service();
	}
	
}

interface USB{
	//服务
	public void service();
}



class Fan implements USB{
	
	public void service(){
		System.out.println("旋转...");
	}
	
}


class Lamp implements USB{
	public void service(){
		System.out.println("照明...");
	}
}


class UDisk implements USB{
	public void service(){
		System.out.println("读写数据...");
	}
}

