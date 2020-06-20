public class TestFibonacci{
	public static void main(String[] args){
		
		//0 1 1 2 3 5 8 13 21 34 55 89
		
		int target = 10;//目标第10项 --> 55
		
		
		int a = 0;
		int b = 1;
		
		for(int i = 2; i <= target ; i++){
			int c = a + b;
			System.out.println(c);
			
			a = b;
			b = c;
		}
		
		
		
	}
}