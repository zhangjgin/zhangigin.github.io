package test;

public class TestReturnValue {

	public static void main(String[] args) {

		int result = m1();
		
		System.out.println(result);
	
	}

	public static int m1(){
		int a = 10;
		
		try{
			a = 20;
			throw new RuntimeException();
		}catch(Exception e){
			a = 30;
			return a;
		}finally{
			a = 40;
		}
	}
	
}
