public class TestUSB{
	public static void main(String[] args){
		
		//����Գ
		
		
		Computer c1 = new Computer();
		
		
		c1.on(new Fan() , new Lamp() , new UDisk() );//ʹ�ù���
		
	}
}
class Computer{//����
	
	USB u1;
	USB u2;
	USB u3;
	
	public void on(USB u1 , USB u2 , USB u3){
		this.u1 = u1;
		this.u2 = u2;
		this.u3 = u3;
		
		System.out.println("�������������ҳ��...");
		
		//�ӿڵ�ʹ����
		u1.service();
		u2.service();
		u3.service();
	}
	
}

interface USB{
	//����
	public void service();
}



class Fan implements USB{
	
	public void service(){
		System.out.println("��ת...");
	}
	
}


class Lamp implements USB{
	public void service(){
		System.out.println("����...");
	}
}


class UDisk implements USB{
	public void service(){
		System.out.println("��д����...");
	}
}

