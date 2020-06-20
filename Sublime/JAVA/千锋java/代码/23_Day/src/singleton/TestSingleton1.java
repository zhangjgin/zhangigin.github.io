package singleton;

public class TestSingleton1 {

	public static void main(String[] args) throws ClassNotFoundException {
		
		Singleton s = Singleton.getInstance();
		
		System.out.println(s);
		
		Singleton s2 = Singleton.getInstance();
		
		System.out.println(s2);
		
		//Class.forName("singleton.Singleton");
		
	}
}

//饿汉式：天生线程安全、类加载时创建（不好，不用的时候也被迫创建，占用一点点资源）
//class Singleton{
//	private static final Singleton instance = new Singleton();
//	
//	private Singleton(){}
//	
//	public static Singleton getInstance(){
//		return instance;
//	}
//}


//懒汉式：使用时再创建、天生线程不安全（加锁）
//class Singleton{
//	
//	private static Singleton instance = null;
//	
//	private Singleton(){}
//	
//	public synchronized static Singleton getInstance(){
//		if(instance == null){
//			instance = new Singleton();
//		}
//		return instance;
//	}
//}

//懒汉式：用时再创建、天生线程安全
class Singleton{
	private Singleton(){}
	
	private static class Holder{
		static final Singleton instance = new Singleton();
	}
	
	public static Singleton getInstance(){
		return Holder.instance;
	}
}










