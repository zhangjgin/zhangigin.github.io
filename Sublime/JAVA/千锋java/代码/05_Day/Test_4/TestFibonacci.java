public class TestFibonacci{
	public static void main(String[] args){
		
		//0 1 1 2 3 5 8 13 21 34 55 89  xxx��

		//fibonacci(4);//������
		
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
	//��ǰ��n�Ľ������ǰ����ĺ�
	//�Ȼ�ȡ��ǰ���������ֵ�����������ͣ������ظ�������
	public static int fibonacci4(int n){//n=4
		
		//int sum = �������ֵ + �ڶ����ֵ
		
		int sum = fibonacci3(n-1) + fibonacci2(n-2);
		
		return sum;
	}
	
	public static int fibonacci3(int n){//n=3
		//int sum = �ڶ����ֵ + ��һ���ֵ
		
		int sum = fibonacci2(n-1) + fibonacci1(n-2);
		
		return sum;
	}
	
	public static int fibonacci2(int n){//n=2
		
		//int sum = ��һ���ֵ + �������ֵ
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
