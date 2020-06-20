public class TestGoldBach{

	public static void main(String[] args){
		
		checkGoldBach( new GoldBach() );
		
	}
	
	//验证哥德巴赫
	public static void checkGoldBach(CheckPrime cp){
		
		//2.写哥德巴赫的猜想逻辑
		int num = 8;
		
		for(int i = 1 ; i < num ; i++){
			
			int a = num - i;
			
			if(cp.isPrime(a) && cp.isPrime(i)){
				//OK
			}
		}
	}
}

//1.定义标准
interface CheckPrime{
	public boolean isPrime(int n);
}


//2.写接口的实现类
class GoldBach implements CheckPrime{
	
	public boolean isPrime(int n){
		//判断该值是否为质数
	}
	
}