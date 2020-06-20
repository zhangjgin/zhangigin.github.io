public class TestLocalVariables{
	public static void main(String[] args){
		
		int a = 10;//局部变量
		
		System.out.println(a);
		
		if(a % 2 == 0){
			
			//int a = 20;//重名的局部变量
			
			//System.out.println(a);
			
			int b = 30;
			
			System.out.println(b);
		}
		
		int c = 40;
		
		System.out.println(c);
		
		
	}
}
	