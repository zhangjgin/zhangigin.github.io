package dispose;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class TestMoreTryCatch {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		int result = -1;
		
		try{
			
			System.out.println("请输入被除数：");
			int num1 = input.nextInt();
			
			System.out.println("请输入除数：");
			int num2 = input.nextInt();
		
			result = num1 / num2;
			
		}catch(ArithmeticException e){
			System.out.println("除数不能为零!");
		}catch(InputMismatchException e){
			System.out.println("请输入有效整数!");
		}catch(RuntimeException e){
			System.out.println("未知的运行时异常，请联系管理员");
		}catch(Exception e){
			System.out.println("未知的受查异常，请联系管理员!");
		}
		
		System.out.println(result);//无论运行是否存在异常，都要打印结果
		
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
