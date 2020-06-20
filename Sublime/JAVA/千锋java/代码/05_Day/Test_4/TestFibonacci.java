public class TestFibonacci{
	public static void main(String[] args){
		
		//0 1 1 2 3 5 8 13 21 34 55 89  xxx项

		//fibonacci(4);//第四项
		
		int result = fibonacci(10);
		
		System.out.println(result);
	}
	
	public static int fibonacci(int n){//n=2
		if(n == 0){
			return 0;
		}else if(n == 1){
			return 1;
		}
		
		return fibonacci(n-1) + fibonacci(n-2);
	}
	
	/*
	//当前项n的结果，是前两项的和
	//先获取到前两项各个的值，进行相加求和，并返回给调用者
	public static int fibonacci4(int n){//n=4
		
		//int sum = 第三项的值 + 第二项的值
		
		int sum = fibonacci3(n-1) + fibonacci2(n-2);
		
		return sum;
	}
	
	public static int fibonacci3(int n){//n=3
		//int sum = 第二项的值 + 第一项的值
		
		int sum = fibonacci2(n-1) + fibonacci1(n-2);
		
		return sum;
	}
	
	public static int fibonacci2(int n){//n=2
		
		//int sum = 第一项的值 + 第零项的值
		int sum = fibonacci1(n-1) + fibonacci0(n-2);
		
		return sum;
	}
	
	public static int fibonacci1(int n){//n=1
		return 1;
	}
	
	
	public static int fibonacci0(int n){//n=0
		return 0;
	}
	*/
}
