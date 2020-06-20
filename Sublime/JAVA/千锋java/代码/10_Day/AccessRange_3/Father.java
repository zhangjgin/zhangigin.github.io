package p1;

public class Father{
	//private String field;//私有、本类可见
	//String field;//默认、同包可见
	protected String field;//受保护的、同包可见+非同包的子类
	 
	 
	 public void sayHi(){
		 System.out.println("Hello");
	 }
}