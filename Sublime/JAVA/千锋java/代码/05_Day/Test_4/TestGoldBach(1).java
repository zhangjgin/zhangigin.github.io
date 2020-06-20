public class TestGoldBach{
	public static void main(String[] args){
		
		int num = 14;
		
		int half = num - 3;
		
		//1.将该偶数拆分成两个值 -3 -4 -5
		//2.将两个值分别进行是否为质数的验证
		//3.如果两值均为质数，则验证哥德巴赫猜想
		
		
		//i = 3
		//5 3
		//4 4
		//3 5 X
		//2 6 X
		//1 7 X
		
		//将该偶数，依次拆解成两个值进行验证
		for(int i = 3 ; i <= num / 2 ; i++){	
			if(isPrime(i) && isPrime(num-i)){
				System.out.println(i +"\t"+ (num-i));
			}
		}
	}
	
	//判断是否为质数
	public static boolean isPrime(int n){//10
		for(int i = 2 ; i < n ; i++){
			//只有2次被整数
			if(n%i==0){
				return false;
			}
		}
		return true;
	}
	
	
	
	
}