public class TestBasicFunction{
	
	public static void main(String[] args){
		/*
		//����1
		System.out.println("��ǰ���¹⣬");
		System.out.println("------------");
		System.out.println("���ǵ���˪��");
		System.out.println("------------");
		System.out.println("��ͷ�����£�");
		System.out.println("------------");
		System.out.println("��ͷ˼���硣");
		System.out.println("------------");
		
		//����2
		System.out.println("��ǰ���¹⣬");
		
		for(int i = 1 ; i <= 10 ; i++){
			System.out.print("-");
		}
		System.out.println();
		
		System.out.println("���ǵ���˪��");
		
		for(int i = 1 ; i <= 10 ; i++){
			System.out.print("-");
		}
		System.out.println();
		
		System.out.println("��ͷ�����£�");
		
		for(int i = 1 ; i <= 10 ; i++){
			System.out.print("-");
		}
		System.out.println();
		
		System.out.println("��ͷ˼���硣");
		
		for(int i = 1 ; i <= 10 ; i++){
			System.out.print("-");
		}
		System.out.println();
		*/
		
		//����3
		System.out.println("��ǰ���¹⣬");
		printSign(5,'#');//���ú���
		System.out.println("���ǵ���˪��");
		printSign(10,'*');//���õ�ͬʱ��Ϊ�����еġ��ֲ���������ֵ
		System.out.println("��ͷ�����£�");
		printSign(15,'@');
		System.out.println("��ͷ˼���硣");
		printSign(20,'%');
	}
	
	//�Զ��庯��
	public static void printSign(int rows , char sign){//����������

		//int rows;
		
		//char sign;

		for(int i = 1 ; i <= rows ; i++){
			System.out.print(sign);
		}
		System.out.println();
	}
	

}