public class TestMain2{
	public static void main(String[] args){
		Super s = new Sub();
		
		s.m1();//s ---> Super.m1();
		
		s.m2();
		
		//JVM¹æ·¶ invokevirtual invokestatic
		
		m();
	}
	
	public static final String s = "hello";
	
	public static final void m(){
		System.out.println("aaa");
	}
}

class Super{
	public static void m1(){
		System.out.println("Super-m1()");
	}
	
	public void m2(){
		System.out.println("Super-m2()");
	}
}

class Sub extends Super{
	public static void m1(){
		System.out.println("Sub-m1()");
	}
	
	@Override
	public void m2(){
		System.out.println("Sub-m2()");
	}
}