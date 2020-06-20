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
	
	//通用编程
	public static Object factory(String className) throws Exception{
		Class c = Class.forName(className);
		return c.newInstance();
	}
	
	//简单工厂
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
		System.out.println("旋转");
	}
}

class Lamp implements USB{
	@Override
	public void service() {
		System.out.println("照明");
	}
}

class UDisk implements USB{
	@Override
	public void service() {
		System.out.println("读写数据");
	}
}

class Mouse implements USB{
	@Override
	public void service() {
		System.out.println("移动...");
	}
}