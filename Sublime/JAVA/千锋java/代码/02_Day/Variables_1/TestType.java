public class TestType{
	public static void main(String[] args){
		
		byte b = 127;
		
		short s = 32767;
		
		int i = 2147483647;
		
		long l = 2147483648L;
		
		float f = 0.0F;
		
		double d = 0;
		
		System.out.println(f);
		
		System.out.println(d);
		
		System.out.println(Float.MAX_VALUE);
		
		float f2 = (34028235 * 10000000000000000000000000000000F) * 10;
		
		System.out.println(f2);
		
		
		double num1 = 10;
		double num2 = 0;
		
		System.out.println(num1 / num2);
		
		
		
		double num3 = 2.2;
		double num4 = 1.2;
		
		System.out.println(num3 - num4);
		
		
		
		boolean answer = false;
		
		System.out.println(answer);
		
		boolean result = 3 > 2;
		
		System.out.println(result);
		
		
		char c1 = 'A';
		
		char c2 = 'B';
		
		char c3 = 67;
		
		char c4 = '好';
		
		char c5 = '\u0041';
		
		System.out.println(c1);
		
		System.out.println(c2);
		
		System.out.println(c3);
		
		System.out.println( (int)c4 );
		
		System.out.println(c5);	
		
		
		//你 20320 好22909	
		
		char c6 = '\\';	
		
		System.out.println(c6);
		
		
		System.out.print("Hello\nWorld");
		
		System.out.println("Good\tbye");
		
		
		
		String str = null;//字符串内部是字符数组
		
		System.out.println(str);
		
	}
}