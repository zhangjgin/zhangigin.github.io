import java.util.Scanner;

public class TestShowDetails{
	
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		//����̨¼��5��ѧ���ɼ�����������������
		
		double[] scores = new double[5];
		
		System.out.println(scores.length);
		
		
		//��
		for(int i = 0 ; i < scores.length ; i++){// 0 1 2 3 4 
			System.out.println("�������" + (i+1) + "��ѧ���ɼ�");
			scores[i] = input.nextDouble();
		}
		
		//ȡ
		for(int i = 0 ; i < scores.length ; i++){
			scores[i] += 1;
			System.out.println(scores[i]);
		}

		
	}
	
}