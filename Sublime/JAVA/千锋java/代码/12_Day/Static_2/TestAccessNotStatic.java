public class TestAccessNotStatic{
	
	public static void main(String[] args){
		/*
		new A();
		new A();
		new A();
		
		A.staticMethod();
		
		//��̬�����ǿ���ͨ���������õģ��ڵ��ø÷���ʱ�����ܴ�δ����������
		*/
		
		
		//B.staticMethod();//����ʹ����������
		
		
		A a = new B();//��̬
		
		a.staticMethod();//a  --> A.staticMethod()
		
		//Java�еķ������ã���Ϊ����
		
		//1.��̬���ɣ���̬�����У���������б�ͬ������������ָ��̬����֮������أ�
		
		//2.��̬���ɣ��ھ��м̳й�ϵ������£�����ʵ������ʱ���Ե����ϲ��ҿ��õķ����汾��ָʵ�������ĸ��ǣ�
		
		//��������ָ��5��
		//invokespacial ����˽�з��������췽��
		//invokeinterface ���ýӿڷ���
		//invokestatic ���þ�̬����
		//invokevirtual �����鷽�������ඨ��ģ��պ����า�ǵķ�����
		//invokedynamic ���ö�̬���ӷ���
		
		
		
		A.staticMethod();
		B.staticMethod();
	}
}


//��
class A{
	static int field;
	public static void staticMethod(){
		System.out.println("A - staticMethod() " +field);
	}
}

class B extends A{
	//@Override
	public static void staticMethod(){
		System.out.println("B - staticMethod() ");
	}
}