package chp3;

public class ShuiXian {
	public static void main(String[] args) {
		//ѭ�����е���λ��
		for(int i = 100; i<=999; i++){
			//�ֱ�������λ���ϵ�ֵ
			int a = i / 100;
			int b = i / 10 % 10;
			int c = i % 10;
			//�����λ���ֵ�������
			int result = a*a*a + b*b*b + c*c*c;
			if (result == i){
				System.out.println(i);
			}
		}
	}
}
