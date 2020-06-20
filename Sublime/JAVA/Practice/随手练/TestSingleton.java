class Singleton{
	static Singleton s;
	private Singleton(){
		
	}
	public static Singleton getInstance(){
		if(s == null){
			s = new Singleton();
		}
		return s;
	}
}
public class TestSingleton{
public static void main(String[] args){
	Singleton s = Singleton.getInstance();
	System.out.println(s);	
	
	Singleton s1 = Singleton.getInstance();
	System.out.println(s1);
}
}