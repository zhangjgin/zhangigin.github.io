public class TestSwitch{
	public static void main(String[] args){
		
		//һ�ܲ���
		
		int weekDay = 2;//һ������������
		
		switch(weekDay){
			
			default:
				System.out.println("¼������������1~7֮�����Ч���֣�");
				break;
			
			case 1:
				System.out.println("ţ����");
				break;
			
			case 2:
			case 5:
			case 6:
				System.out.println("ը����");
				break;
			
			case 3:
				System.out.println("�������");
				break;
			
			case 4:
				System.out.println("���̼�");
				break;
			
			
			
			case 7:
				System.out.println("������");
				break;
				
		
				
		}
		
		System.out.println("�������");
		
	}
}