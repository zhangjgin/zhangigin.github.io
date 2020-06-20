public class Test{

	public static void main(String[] args){

		int num = 456;
		
		int a = num / 100;
		int b = num / 10 % 10;
		int c = num % 10;
		
		int result = multiply(a) + multiply(b) + multiply(c);
		
		if(result == num){
			//打印
		}
		
	}
	
	public static int multiply(int n){
		//该值的阶乘
		return 0;
	}
}