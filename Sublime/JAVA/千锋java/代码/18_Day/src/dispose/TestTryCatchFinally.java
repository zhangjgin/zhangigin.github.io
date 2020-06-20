package dispose;

public class TestTryCatchFinally {

	public static void main(String[] args) {
		System.out.println(method(1));
	}
	
	public static int method(int n){
		try{
			if(n % 2 == 0){
				throw new RuntimeException("不能为偶数");
			}
			return 10;
		}catch(Exception e){
			System.out.println("捕获异常...");
			return 20;
		}finally{
			System.out.println("方法结束");//必须要执行的
		}
	}

}
