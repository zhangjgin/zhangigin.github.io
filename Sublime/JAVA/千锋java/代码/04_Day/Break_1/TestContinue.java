import java.util.Scanner;

public class TestContinue{
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		//�����������У����ڷǷ����ݣ�������¼��˳ɼ�
		
		double sum = 0D;
		
		for(int i = 1 ; i <= 5 ; ){
			System.out.print("�������" + i + "λѧ���ɼ���");
			
			double score = input.nextDouble();
			
			if(score < 0 || score > 100){
				continue;
			}
			
			sum += score;
			
			i++;
		}
		
		
		double avg = sum / 5;
		System.out.println("ƽ����Ϊ��" + avg);
		
	}
}