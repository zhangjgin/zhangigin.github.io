package chp4;

public class CloseNumber {
	public static void main(String[] args) {
		for(int i = 1; i<=3000; i++){
			int b = sumAllFact(i); // i�����Ӻ�Ϊb
			int a = sumAllFact(b); // b�����Ӻ�Ϊa
			
			//���������a == i����ζ��a�����Ӻ�Ϊb��
			//b�����Ӻ�Ϊa��������������Ҫ��
			//ͬʱ��Ϊ�˱����ظ��⣬Ҫ��a < b
			
			if (a < b  && a==i){
				System.out.println(a + " " + b);
			}
		}
	}
	
	//�������Ӻ͵ĺ���
	public static int sumAllFact(int n){
		int sum = 0;
		for(int i = 1; i<=n/2; i++){
			if (n % i == 0) sum+= i;
		}
		return sum;
	}
}
