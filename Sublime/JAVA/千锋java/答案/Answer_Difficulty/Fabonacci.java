package chp3;

import java.util.Scanner;
public class Fabonacci {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if (n <= 3){
			System.out.println("ǰ3�0, 1, 1");
		}else{
			System.out.print("0, 1, 1");
			//ǰһ���һ�����һ�
			int preLast = 1;
			//��һ��
			int last = 1;
			//��ǰ��
			int thisItem = 0;
			for(int i = 4; i<=n; i++){
				//��ǰ���ֵΪǰһ��+��һ��
				thisItem = preLast + last;
				
				//Ϊ������һ����׼��
				//��һ���ǰһ����ǵ�ǰ�����һ��
				preLast = last;
				//��һ�����һ����ǵ�ǰ��
				last = thisItem;
				System.out.print(", " + thisItem);
			}
		}
	}
}
