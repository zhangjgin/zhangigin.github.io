public class TestFinal{
	public static void main(String[] args){
		
		//先赋值、再使用
		final double PI;

		PI = 3.1415926;
		
		
		Super s = new Super();
	
	}
}

/*final*/ class Super{
	
	final int FIELD = 10;
	
	{
		//FIELD = 20;
	}
	
	public Super(){
		//FIELD = 30;
	}
	
	final static int STATIC_FIELD;
	
	static{
		//STATIC_FIELD = 40;
	}
	
	
	public final void method(){}
}

class Sub extends Super{
	public void method(int a){}
}