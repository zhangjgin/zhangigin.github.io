package chp3;

import java.util.Scanner;

//����t & 1���������ж����λ�Ƿ�Ϊ1
//��˶�ÿ�����������ֱ���λ0��1��2��... 31
//Ȼ����&1�������ж����������0��1��2��... 31λ�Ƿ�Ϊ1

public class SumOfBit {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum = 0;
		for(int i = 0; i<32; i++){
			int t = n >> i;
			//�ж����λ�Ƿ�Ϊ1
			if ( (t & 1) == 1){
				sum ++;
			}
		}
		System.out.println(sum);
	}
}
