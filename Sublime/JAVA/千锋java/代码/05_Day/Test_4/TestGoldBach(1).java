public class TestGoldBach{
	public static void main(String[] args){
		
		int num = 14;
		
		int half = num - 3;
		
		//1.����ż����ֳ�����ֵ -3 -4 -5
		//2.������ֵ�ֱ�����Ƿ�Ϊ��������֤
		//3.�����ֵ��Ϊ����������֤��°ͺղ���
		
		
		//i = 3
		//5 3
		//4 4
		//3 5 X
		//2 6 X
		//1 7 X
		
		//����ż�������β�������ֵ������֤
		for(int i = 3 ; i <= num / 2 ; i++){	
			if(isPrime(i) && isPrime(num-i)){
				System.out.println(i +"\t"+ (num-i));
			}
		}
	}
	
	//�ж��Ƿ�Ϊ����
	public static boolean isPrime(int n){//10
		for(int i = 2 ; i < n ; i++){
			//ֻ��2�α�����
			if(n%i==0){
				return false;
			}
		}
		return true;
	}
	
	
	
	
}