package override;

import java.io.IOException;

public class TestOverrideExceptionMethod {

	public static void main(String[] args) {

		Super s = new Sub();
		
		//s.method();
		
		
		
		Printable p = new MyClass();
		
		try {
			p.print();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		MyClass mc = new MyClass();
		
		try {
			mc.print();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	
}

class Super{
	public void method() throws Exception{
		System.out.println("Super - method()");
	}
	
}

class Sub extends Super{
	public void method() throws IOException , ClassNotFoundException, RuntimeException{
		System.out.println("Sub - method()");
	}
}

interface Printable{
	public void print() throws IOException;
}

class MyClass implements Printable{

	@Override
	public void print() throws IOException{
	}
	
}