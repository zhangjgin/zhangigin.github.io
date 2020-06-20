package transfer;

public class TestTrasnferException {

	public static void main(String[] args) {//默认处理异常（打印堆栈跟踪信息）
		System.out.println("main - start");
		try {
			m1(2);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("main - end");
		
		//method(1);
	}

	public static void m1(int n) throws Exception{
		System.out.println("m1 - start");
		m2(n);
		System.out.println("m1 - end");
	}
	
	public static void m2(int n) throws Exception{
		System.out.println("m2 - start");
		m3(n);
		System.out.println("m2 - end");
	}
	
	public static void m3(int n) throws Exception{//向上报告（告知了调用者，此方法可能产生的异常）
		System.out.println("m3 - start");
		if(n % 2 == 0){
			throw new Exception("打印菱形，行号必须为奇数！");
		}
		System.out.println("打印菱形");
	}
	
	/*public static void method(int n){
		if(n % 2 == 0){
			throw new RuntimeException();
		}
	}*/
	
}
