package transfer;

public class TestTrasnferException {

	public static void main(String[] args) {//Ĭ�ϴ����쳣����ӡ��ջ������Ϣ��
		System.out.println("main - start");
		try {
			m1(2);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("main - end");
		
		//method(1);
	}

	public static void m1(int n) throws Exception{
		System.out.println("m1 - start");
		m2(n);
		System.out.println("m1 - end");
	}
	
	public static void m2(int n) throws Exception{
		System.out.println("m2 - start");
		m3(n);
		System.out.println("m2 - end");
	}
	
	public static void m3(int n) throws Exception{//���ϱ��棨��֪�˵����ߣ��˷������ܲ������쳣��
		System.out.println("m3 - start");
		if(n % 2 == 0){
			throw new Exception("��ӡ���Σ��кű���Ϊ������");
		}
		System.out.println("��ӡ����");
	}
	
	/*public static void method(int n){
		if(n % 2 == 0){
			throw new RuntimeException();
		}
	}*/
	
}
