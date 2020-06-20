package factory;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.Reader;

public class TestFactory {

	public static void main(String[] args) throws Exception {
		
		Reader fr = new FileReader("informations\\application.txt");
		
		BufferedReader br = new BufferedReader(fr);
		
		String className = br.readLine();

		Object obj = factory(className);
		
		System.out.println(obj);
	}
	
	//ͨ�ñ��
	public static Object factory(String className) throws Exception{
		Class c = Class.forName(className);
		return c.newInstance();
	}
	
	//�򵥹���
	public static Object factory(int n){
		Object o = null;
		if(n == 1){
			o = new Fan();
		}else if(n == 2){
			o = new Lamp();
		}else{
			o = new UDisk();
		}
		return o;
	}

}

interface USB{
	public void service();
}

class Fan implements USB{
	@Override
	public void service() {
		System.out.println("��ת");
	}
}

class Lamp implements USB{
	@Override
	public void service() {
		System.out.println("����");
	}
}

class UDisk implements USB{
	@Override
	public void service() {
		System.out.println("��д����");
	}
}

class Mouse implements USB{
	@Override
	public void service() {
		System.out.println("�ƶ�...");
	}
}