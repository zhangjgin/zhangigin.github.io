public class TestMultiply{
	public static void main(String[] args){
	
		int num = 6;
		
		int result = multiply(num);//120
		
		System.out.println(result);
		
		
		System.out.println( add(100) );
		
		print(1);
	}
	
	/*
	public static int multiply5(int n){//n=5
		return n * multiply4(n-1);
		//return 5 * 24;
	}
	
	
	public static int multiply4(int n){//n=4
		return n * multiply3(n-1);
		//return 4 * 6;
	}
	
	
	public static int multiply3(int n){//n=3
		return n * multiply2(n-1);
		//return 3 * 2;
	}
	
	public static int multiply2(int n){//n=2
		return n * multiply1(n-1);
		//return 2 * 1;
	}
	
	public static int multiply1(int n){//n=1
		//出口
		return 1;
	}
	*/
	
	
	public static int multiply(int n){
		if(n == 1){
			return 1;
		}
		return n * multiply(n-1);
	}
	
	
	public static int add(int n){//100
		if(n == 1){
			return 1;
		}
		return n + add(n-1);
	}
	
	
	public static void print(int n){//1
		System.out.println(n);
		if(n == 100){
			return;
		}
		print(n+1);
		
	}
	
}