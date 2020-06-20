public class TestStatic{
	public static void main(String[] args){
		
		MyClass mc1 = new MyClass();
		MyClass mc2 = new MyClass();
		
		
		mc1.a = 10;
		mc2.a = 20;
		
		
		mc1.b = 100;//自动转换 mc1.b ---> MyClass.b
		mc2.b = 200;
		
		
		System.out.println(mc1.a +"\t"+ mc2.a);
		
		System.out.println(MyClass.b +"\t"+ MyClass.b);//静态成员通过类名访问
		
	}
}

class MyClass{
	int a;
	static int b;
}