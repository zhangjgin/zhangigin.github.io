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
			
			System.out.println("�����뱻������");
			int num1 = input.nextInt();
			
			System.out.println("�����������");
			int num2 = input.nextInt();
		
			result = num1 / num2;
			
		}catch(ArithmeticException e){
			System.out.println("��������Ϊ��!");
		}catch(InputMismatchException e){
			System.out.println("��������Ч����!");
		}catch(RuntimeException e){
			System.out.println("δ֪������ʱ�쳣������ϵ����Ա");
		}catch(Exception e){
			System.out.println("δ֪���ܲ��쳣������ϵ����Ա!");
		}
		
		System.out.println(result);//���������Ƿ�����쳣����Ҫ��ӡ���
		
		System.out.println("�������");
		
		
		
		
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
