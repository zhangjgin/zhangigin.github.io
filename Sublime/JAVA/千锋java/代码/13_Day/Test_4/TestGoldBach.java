public class TestGoldBach{

	public static void main(String[] args){
		
		checkGoldBach( new GoldBach() );
		
	}
	
	//��֤��°ͺ�
	public static void checkGoldBach(CheckPrime cp){
		
		//2.д��°ͺյĲ����߼�
		int num = 8;
		
		for(int i = 1 ; i < num ; i++){
			
			int a = num - i;
			
			if(cp.isPrime(a) && cp.isPrime(i)){
				//OK
			}
		}
	}
}

//1.�����׼
interface CheckPrime{
	public boolean isPrime(int n);
}


//2.д�ӿڵ�ʵ����
class GoldBach implements CheckPrime{
	
	public boolean isPrime(int n){
		//�жϸ�ֵ�Ƿ�Ϊ����
	}
	
}