public class TestOverload{
	public static void main(String[] args){
		
		Printer p = new Printer();
		
		p.show("Hello");
		p.show(123);
		p.show('A');
		p.show(1.2);
		
		//屏蔽使用者的差异
		
		
		System.out.println();
	}
}

//打印机
class Printer{
	//打印、输出
	public void show(int content){
		System.out.println(content);
	}
	
	
	public void show(double content){
		System.out.println(content);
	}
	
	public void show(char content){
		System.out.println(content);
	}
	
	
	public void show(String content){
		System.out.println(content);
	}
}