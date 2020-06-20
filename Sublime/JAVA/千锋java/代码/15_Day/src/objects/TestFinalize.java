package objects;

public class TestFinalize {

	public static void main(String[] args) throws Throwable{

		//���ü����㷨
		
		MyClass mc = new MyClass();//0x1122
		
		MyClass mc2 = mc;
//		
//		mc.method();
//		
//		System.out.println(mc);
		
		mc = null;
		
		A a = new A();//0x0001
		B b = new B();//0x0002
		
		//�ɴ��Է����㷨
		a.bField = b;
		b.aField = a;
		
		System.out.println(a.bField);
		System.out.println(b.aField);
		
		a = null;
		b = null;
		
		System.gc();//100
	}

}

class XXX{
	public static MyClass mc; 
}

class MyClass{
	
	@Override
	protected void finalize() throws Throwable {
		XXX.mc = this;
		System.out.println("MyClass finalize Exected");
		super.finalize();
	}
	
	//����Ա���ø����finalize()����û��˿����ֵ
//	public void method() throws Throwable{
//		super.finalize();
//	}
}


class A{
	B bField;

	@Override
	protected void finalize() throws Throwable {
		System.out.println("A���󱻱��");
		super.finalize();
	}
	
	
}

class B{
	A aField;
	
	@Override
	protected void finalize() throws Throwable {
		System.out.println("B���󱻱��");
		super.finalize();
	}
}

