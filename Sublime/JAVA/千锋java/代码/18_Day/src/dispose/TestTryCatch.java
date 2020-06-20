package dispose;

import java.util.Scanner;

public class TestTryCatch {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.println("请输入被除数：");
		int num1 = input.nextInt();
		
		System.out.println("请输入除数：");
		int num2 = input.nextInt();
		
		try{
			int result = num1 / num2; //throw new ArithmericException("/ by zero")
			System.out.println(result);
		}catch(Exception e){//= new ArithmeticException();
			//System.out.println("注意，除数不能为零!");//处理方案1（自定义处理）
			//e.printStackTrace();//处理方案2（打印堆栈跟踪信息）
			//System.out.println(e.getMessage());//处理方案3（单独获取Message作为异常原因）
		}
		
		System.out.println("程序结束");
		
	}
	


}




/*class Throwable{
	private String message;
	
	public Throwable(String message){
		this.message = message;
	}
	
	public String getMessage(){
		return this.message;
	}
}


class Exception extends Throwable{
	public Exception(String message){
		super(message);
	}
}*/
