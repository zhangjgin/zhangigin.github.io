public class TestStatic{
	public static void main(String[] args){
		
		MyClass mc1 = new MyClass();
		MyClass mc2 = new MyClass();
		
		
		mc1.a = 10;
		mc2.a = 20;
		
		
		mc1.b = 100;//�Զ�ת�� mc1.b ---> MyClass.b
		mc2.b = 200;
		
		
		System.out.println(mc1.a +"\t"+ mc2.a);
		
		System.out.println(MyClass.b +"\t"+ MyClass.b);//��̬��Աͨ����������
		
	}
}

class MyClass{
	int a;
	static int b;
}