package dispose;

public class TestTryCatchFinally {

	public static void main(String[] args) {
		System.out.println(method(1));
	}
	
	public static int method(int n){
		try{
			if(n % 2 == 0){
				throw new RuntimeException("����Ϊż��");
			}
			return 10;
		}catch(Exception e){
			System.out.println("�����쳣...");
			return 20;
		}finally{
			System.out.println("��������");//����Ҫִ�е�
		}
	}

}
