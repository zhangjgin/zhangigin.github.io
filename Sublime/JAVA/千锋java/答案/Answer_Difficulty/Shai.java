package chp5;

import java.util.Scanner;
public class Shai{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		boolean bs[] = new boolean[n+1];		
		//��ʼ��
		for(int i = 0; i<bs.length; i++){
			bs[i] = true;
		}		
		//����bs.length��ɸѡ
		for(int i = 2; i<bs.length; i++){
			if (bs[i]){//iΪ����
				//��i�ı�����Ϊfalse
				for (int j = i*2; j<bs.length; j+= i){
					bs[j] = false;
				}
			}else{//i��Ϊ����
				continue;
			}
		}		
		//���
		for(int i = 2; i<bs.length; i++){
			if (bs[i]){
				System.out.print(i + "\t");
			}
		}
		System.out.println();	
	}
}