import java.util.Scanner;

public class TestBreak{
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		//�����������У����ڷǷ����ݣ�������ɼ����ϡ�
		
		
		boolean flag = true;//true����Ϸ�
		
		double sum = 0D;
		
		for(int i = 1 ; i <= 5 ; i++){
			System.out.print("�������" + i + "λѧ���ɼ���");
			
			double score = input.nextDouble();
			
			if(score < 0 || score > 100){
				flag = false;//���ڷǷ�����
				break;
			}
			
			sum += score;
		}
		
		
		if(flag){//flag == true
			double avg = sum / 5;
			System.out.println("ƽ����Ϊ��" + avg);
		}else{
			System.out.println("�����������������룡");
		}
		
		
	}
}