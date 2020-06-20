package callback;

//工具类，被主方法调用
public class Tool {

	//哥德巴赫猜想
	public static void checkGoldBach(CheckPrime cp){
		
		//调用接口的方法
		cp.isPrime();
	}
}
