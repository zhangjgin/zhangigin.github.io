package exceptions;

public class TestMethodBack {

	public static void main(String[] args) {
		m1(2);
	}

	
	//���Σ�����������������
	public static void m1(int rows){
		if(rows % 2 == 0){
			throw new RuntimeException();//return
		}
		
		//��ɴ�ӡ���εĲ���
		//...
		//...
		//...
		System.out.println("��ӡ����...");
		
		//..
		//...
		
		System.out.println("��ӡ������Σ�����ִ��");
	}
}
