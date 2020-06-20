package dispose;

public class TestDemo {

	public static void main(String[] args) {
		
	}
	
	//核心方法（每个用户都需要使用） 5万
	public static void method(){
		try{
			//使用资源对象 --> 发生了异常
			//发生了异常
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			//使用完毕，关闭资源
		}
	}

}
