public class TestReturn{
	public static void main(String[] args){
		
		int result = add(5,10);//���15   �ȼ��� int result = 15;
		
		//��һ�μ���ĺͣ�����һ��ֵ����������
		System.out.println("main�еķ���ֵ��" + result);
		
		
		int result2 = subtract(100 , 30);
		
		System.out.println(result2);
		
		
		int result3 = multiply(5,20);
		
		System.out.println(result3);
		
		double result4 = devide(20,3);
		
		System.out.println(result4);
		
		
		add(5,6);
		
		boolean a = method(10);
	}
	
	public static int add(int a , int b){
		int sum = a + b;
		return sum;
	}
	
	public static int subtract(int a , int b){
		return a - b;
	}
	
	public static int multiply(int a , int b){
		return a * b;
	}
	
	public static double devide(double a , double b){
		return a / b;
	}
	
	
	public static boolean method(int num){
		return true;
	}
}