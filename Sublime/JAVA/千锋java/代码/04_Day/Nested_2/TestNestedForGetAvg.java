import java.util.Scanner;

public class TestNestedForGetAvg{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		//ѭ����������i   j   k
		
		
		//���ڲ����뷴��ִ��3��
		for(int i = 1 ; i <= 3 ; i++){
			
			//--��һ����5λͬѧ��ƽ�ַ�------------------------------------
			double sum = 0D;
			
			for(int j = 1 ; j <= 5 ; j++ ){
				System.out.print("�������" + j + "λѧ���ɼ���");
				
				double score = input.nextDouble();
				
				sum += score;
			}

			double avg = sum / 5;
			
			System.out.println("ƽ����Ϊ��" + avg);
			//-------------------------------------------------------------	
			
		}
		
		
	
	}
}