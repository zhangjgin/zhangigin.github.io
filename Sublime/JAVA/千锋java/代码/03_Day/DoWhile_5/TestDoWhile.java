import java.util.Scanner;

public class TestDoWhile{
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		
		//Tomͬѧд��ҵ�������ɵĲ��ã������³�дһ�顣�����ɵĺã��������
		
		char answer;//��ʼ����
		
		do{
			System.out.println("��дһ�顣�����ú�ѧϰ����������");//ѭ������
			
			System.out.println("��ʦ�������ۣ�");//ѭ������
			
			answer = input.next().charAt(0);//��������
		}while(answer != 'y');//ѭ������
		
	}
}