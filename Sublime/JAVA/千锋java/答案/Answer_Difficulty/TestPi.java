package chp3;

public class TestPi {

	public static void main(String[] args) {
		double pi = 0; //�ۼ�ͳ��pi��ֵ
		double base = 1; //��ĸ
		int prefix = 1;  //���������Ǽӻ��Ǽ�
		int i = 0;		//ͳ�ƽ����˶��ٴμӼ�����
		while(pi < 3.1415926 || pi > 3.1415927){
			pi += prefix * 4 / base;
			i ++;
			prefix *= -1;
			base += 2;
		}
		System.out.println(i);
	}
}
