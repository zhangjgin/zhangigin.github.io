public class TestBasicFunction{
	
	public static void main(String[] args){
		/*
		//方案1
		System.out.println("床前明月光，");
		System.out.println("------------");
		System.out.println("疑是地上霜。");
		System.out.println("------------");
		System.out.println("举头望明月，");
		System.out.println("------------");
		System.out.println("低头思故乡。");
		System.out.println("------------");
		
		//方案2
		System.out.println("床前明月光，");
		
		for(int i = 1 ; i <= 10 ; i++){
			System.out.print("-");
		}
		System.out.println();
		
		System.out.println("疑是地上霜。");
		
		for(int i = 1 ; i <= 10 ; i++){
			System.out.print("-");
		}
		System.out.println();
		
		System.out.println("举头望明月，");
		
		for(int i = 1 ; i <= 10 ; i++){
			System.out.print("-");
		}
		System.out.println();
		
		System.out.println("低头思故乡。");
		
		for(int i = 1 ; i <= 10 ; i++){
			System.out.print("-");
		}
		System.out.println();
		*/
		
		//方案3
		System.out.println("床前明月光，");
		printSign(5,'#');//调用函数
		System.out.println("疑是地上霜。");
		printSign(10,'*');//调用的同时，为函数中的“局部变量”赋值
		System.out.println("举头望明月，");
		printSign(15,'@');
		System.out.println("低头思故乡。");
		printSign(20,'%');
	}
	
	//自定义函数
	public static void printSign(int rows , char sign){//声明、定义

		//int rows;
		
		//char sign;

		for(int i = 1 ; i <= rows ; i++){
			System.out.print(sign);
		}
		System.out.println();
	}
	

}