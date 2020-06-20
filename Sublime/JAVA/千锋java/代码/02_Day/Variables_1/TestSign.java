public class TestSign{
	public static void main(String[] args){
		int a = 10;
		int b = 3;
		
		System.out.println(a/b);
		System.out.println(a%b);
		
		int c = 10;
		
		++c;//独立一行进行书写（永远代表+1）
		
		System.out.println(c);
		
		
		int d = 10;
		
		System.out.println(d++);//10
		
		System.out.println(d);
		
		int e = b++;
		
		System.out.println(e);
		
		
		//-----------------------------------------
		
		
		int num1 = 20;
		
		num1 %= 5;//num1 = num1 + 5;
		
		System.out.println(num1);
		
		//-----------------------------------------
		
		System.out.println(5 >= 2);//true
		
		System.out.println(5 == 2);//false
		
		System.out.println(5 != 2);//true
		
		//------------------------------------------
		
		double javaSeScore = 98.5;
		
		double javaEeScore = 100.0;
		
		//										 false
		//							false		  &&		true
		//System.out.println( javaSeScore == 100.0  &&  javaEeScore == 100.0  );
		
		
		//										true
		//							false		  ||		true
		//System.out.println( javaSeScore == 100.0  ||  javaEeScore == 100.0  );
		
		
		//num中的值是否为5的倍数? 是 true 是5的倍数
		int num = 20;
		
		System.out.println(  num % 5 == 0 );
		
		//num中的值应该不是5的倍数吧？ false 代表了5的倍数
		
		System.out.println(  !(num % 5 == 0)  );
		
		
		//
		
		//String tag = "生日快乐" / "继续等待"
		
		int day = 27;
		
		String tag =  day == 28 ? "生日快乐" : "继续等待";
		
		System.out.println(tag);
		
		
		
		
		
		
		
	}
}