public class TestExtendsCreate{
	public static void main(String[] args){
		C c = new C();
		
		System.out.println(c.cField);
		System.out.println(c.bField);
		System.out.println(c.aField);
		
	}
}

class A{//extends java.lang.Object
	//2.��ʼ������
	int aField = 10;
	
	public A(){
		super();//1.���ø�����޲ι��췽�����ݲ���ע��
		System.out.println("A() " + aField);//3.ִ�й��췽���Ĵ���
	}
}

class B extends A{
	//2.��ʼ������
	int bField = 20;
	
	public B(){
		super();//1.���ø�����޲ι��췽��
		System.out.println("B() " + bField);//3.ִ�й��췽���Ĵ���
	}
}

class C extends B{
	//2.��ʼ������
	int cField = 30;
	
	public C(){
		super();//1.���ø�����޲ι��췽��
		System.out.println("C() " + cField);//3.ִ�й��췽���Ĵ���
	}
}