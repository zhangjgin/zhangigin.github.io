import java.util.Scanner;
public class TestGuess{
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		
		//�˻���ȭ��1.������2.ʯͷ��3.����
		
		int cCount = 0;//���Լ�����
		int pCount = 0;//��Ҽ�����
		
		
		for(int i = 1 ; i <= 3 ; ){
			
			int computer = ((int)(Math.random() * 10)) % 3 + 1;
			
			System.out.println(computer);
			
			System.out.print("�������ȭ�ı�ţ�1.������2.ʯͷ��3.������");
			int player = input.nextInt();
			
			//�Ƚ�
			if(computer == player){
				System.out.println("����Ŷ���ٽ�������");
				continue;
			}else if( (player == 1 && computer == 3) || (player == 2 && computer == 1)
				|| (player == 3 && computer == 2)  ){
				System.out.println("��ϲ������");
				pCount++;
			}else{
				System.out.println("��ѽ����Ҳ���а������������Ҳ�����ð�");
				cCount++;
			}
			
			if(cCount == 2 || pCount == 2){
				break;
			}
			
			i++;
		}
		
	}
}