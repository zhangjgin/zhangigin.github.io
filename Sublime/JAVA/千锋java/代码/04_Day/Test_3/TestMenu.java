import java.util.*;

public class TestMenu{
	
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("------��ӭʹ��ATM�������з���------");
		
		int choice = 0;
		
		int count = 0;
		
		do{
			System.out.println("1.���� 2.��� 3.ȡ�� 4.ת�� 5.��ѯ��� 6.�޸����� 0.�˳�");
			
			System.out.println("-----------------------------------");
			
			System.out.print("�����������ţ�");
			
			choice = input.nextInt();
			
			switch(choice){
				case 0:
					System.out.println("ִ���˳�����");
					return;
				case 1:
					System.out.println("ִ�п�������");
					break;
				case 2:
					System.out.println("ִ�д�����");
					break;
				case 3:
					System.out.println("ִ��ȡ�����");
					break;
				case 4:
					System.out.println("ִ��ת�˲���");
					break;
				case 5:
					System.out.println("ִ�в�ѯ������");
					break;
				case 6:
					System.out.println("ִ���޸��������");
					break;
				default:
					System.out.println("�����������������룡");
					count++;
					break;
			}
			
			System.out.println("switch����");
			
			if(count == 3){
				break;
			}
			
			System.out.println("��������жϽ���");

		}while(choice < 0 || choice > 6);
		
		System.out.println("�������");
		
	}
}