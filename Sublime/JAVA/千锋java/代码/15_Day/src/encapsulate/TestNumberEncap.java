package encapsulate;

public class TestNumberEncap {

	public static void main(String[] args) {

//		Byte Short Integer Long Float Double 都具有将自身类型的对象，转换成其他6种基本类型的方法
		
		//将包装类型转换为基本类型（6种）
		Short s = new Short("10");
		
		byte v1 = s.byteValue();
		short v2 = s.shortValue();
		int v3 = s.intValue();
		long v4 = s.longValue();
		float v5 = s.floatValue();
		double v6 = s.doubleValue();
		
		System.out.println(v1);
		System.out.println(v2);
		System.out.println(v3);
		System.out.println(v4);
		System.out.println(v5);
		System.out.println(v6);
		
		//将字符串转换成byte
		byte b1 = Byte.parseByte("123");
		byte b2 = new Byte("123").byteValue();
		
		
		//将字符串转换成int
		int i1 = Integer.parseInt("234");
		int i2 = new Integer("345").intValue();
		
		
		//valueOf
		Byte b3 = Byte.valueOf( (byte)123 );
		Byte b4 = new Byte("1230");
		
		
	}

}
