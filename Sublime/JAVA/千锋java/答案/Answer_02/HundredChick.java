package chp3;

public class HundredChick {
	public static void main(String[] args) {
		for(int a = 0; a<=33; a++){//���33ֻ����
			for(int b = 0; b<=50; b++){//���50ֻĸ��
				int c = 100 - a - b; //cֻС��
				if(c % 3 != 0) continue; //c������3�ı���
				int sumPrice = a*3 + b*2 + c/3; //�����ܼ�
				if (sumPrice == 100){
				    System.out.println(a + "ֻ������" + b + "ֻĸ����" + c + "ֻС��");
				}
			}
		}
	}
}
