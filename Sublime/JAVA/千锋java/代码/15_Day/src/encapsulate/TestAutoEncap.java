package encapsulate;

public class TestAutoEncap {

	public static void main(String[] args) {
		
		//语法糖（Java语言规范）
		Byte b = 10;//自动装箱 调用valueOf(byte b)
		
		byte b2 = b;//自动拆箱 调用byteValue();  shortValue()   intValue()  booleanValue()
		

		
		Short s1 = 100;//从长度为256的数组中，取出预先创建好的一个Short对象（此对象代表整数100） 0x7777
		Short s2 = 100;
		
		Short s3 = 200;//0x1234
		Short s4 = 200;//0x6789
		
		System.out.println(s1 == s2);
		System.out.println(s3 == s4);
		
		//false false
		//true true
		//true false
		
		
	}
	


}
