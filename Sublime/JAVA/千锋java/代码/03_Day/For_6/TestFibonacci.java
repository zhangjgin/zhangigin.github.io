public class TestFibonacci{
	public static void main(String[] args){
		
		//0 1 1 2 3 5 8 13 21 34 55 89
		
		int target = 10;//Ŀ���10�� --> 55
		
		
		int a = 0;
		int b = 1;
		System.out.println(a);
		System.out.println(b);
		
		for(int i = 2; i <= target ; i++){
			int c = a + b;
			System.out.println(c);
			
			a = b;
			b = c;
		}
		
		
		//��ֵ����
		int num1 = 5;
		int num2 = 8;
		
		int temp = num1;
		num1 = num2;
		num2 = temp;
		
	}
}



