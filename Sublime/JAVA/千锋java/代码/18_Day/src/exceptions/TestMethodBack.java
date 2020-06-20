package exceptions;

public class TestMethodBack {

	public static void main(String[] args) {
		m1(2);
	}

	
	//菱形（行数必须是奇数）
	public static void m1(int rows){
		if(rows % 2 == 0){
			throw new RuntimeException();//return
		}
		
		//完成打印菱形的操作
		//...
		//...
		//...
		System.out.println("打印菱形...");
		
		//..
		//...
		
		System.out.println("打印完毕菱形，继续执行");
	}
}
