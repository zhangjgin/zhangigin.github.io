

public class TestLoadSort{
	public static void main(String[] args) throws Exception{
		
		
		
		
		//Class.forName("Sub");//主动加载一个类
		
		
		new Sub();
		
		new Sub();
	}
}


class Super{
	
	static String staticField = "父类静态属性";
	
	static{
		System.out.println(staticField);
		System.out.println("父类静态代码块");
	}
	
	String instanceField = "父类实例属性";
	
	{
		System.out.println(instanceField);
		System.out.println("父类实例代码块");
	}
	
	public Super(){
		System.out.println("父类构造方法");
	}
	
}

class Sub extends Super{
	static String staticField2 = "子类静态属性";
	
	static{
		System.out.println(staticField2);
		System.out.println("子类静态代码块");
	}
	
	String instanceField2 = "子类实例属性";
	
	{
		System.out.println(instanceField2);
		System.out.println("子类实例代码块");
	}
	
	public Sub(){
		System.out.println("子类构造方法");
	}
}