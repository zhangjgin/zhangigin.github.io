package dispose;

import java.util.Scanner;

public class TestTryCatch {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.println("�����뱻������");
		int num1 = input.nextInt();
		
		System.out.println("�����������");
		int num2 = input.nextInt();
		
		try{
			int result = num1 / num2; //throw new ArithmericException("/ by zero")
			System.out.println(result);
		}catch(Exception e){//= new ArithmeticException();
			//System.out.println("ע�⣬��������Ϊ��!");//������1���Զ��崦��
			//e.printStackTrace();//������2����ӡ��ջ������Ϣ��
			//System.out.println(e.getMessage());//������3��������ȡMessage��Ϊ�쳣ԭ��
		}
		
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
