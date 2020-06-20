public class TestClassLoaded{
	public static void main(String[] args){
		//new Super();//首次用到
		
		//Super.sMethod();
		
		//Super.sField
		
		//Sub.sMethod();
	}
}

Class Super{
	
	static String sField;
	
	String field;
	
	public static void sMethod(){
		
	}
}


class Sub extends Super{
	
}