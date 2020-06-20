public class TestReturn{
	public static void main(String[] args){
		
		int result = add(5,10);//变成15   等价于 int result = 15;
		
		//上一次计算的和，与另一个值，继续计算
		System.out.println("main中的返回值：" + result);
		
		
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