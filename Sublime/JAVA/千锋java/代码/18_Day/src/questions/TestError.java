package questions;

public class TestError {

	public static void main(String[] args) {
		m();
	}
	
	public static void m(){
		int a = 10;
		int b = 20;
		int c = 30; 
		Object d = new Object();
		
		m();
	}

}
