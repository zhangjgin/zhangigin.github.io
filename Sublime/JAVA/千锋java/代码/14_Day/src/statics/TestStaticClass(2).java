package statics;

public class TestStaticClass {

	public static void main(String[] args) {

		//�ⲿ��ľ�̬����
		System.out.println(Outer.a);
		
		//�ⲿ��ľ�̬����
		Outer.m1();
		
		
		//������̬�ڲ������ʱ������ֱ��ͨ���������ƽ��д���
		Outer.Inner in = new Outer.Inner();//��̬�ڲ���Ĵ������������ⲿ��Ķ���
		
		//�����ڲ������󣬷���ʵ�����Ժͷ���
		System.out.println(in.b);
		in.m2();

		//&&����ȳ�Ա�ڲ������һ����������ݣ���̬���Ժ;�̬������&&
		
		//ͨ���ⲿ������.�ڲ�������.�ڲ���ľ�̬����
		System.out.println(Outer.Inner.field);
		//ͨ���ⲿ������.�ڲ�������.�ڲ���ľ�̬����
		Outer.Inner.m3();

	}
}


class Outer{
	
	static int a = 10;
	
	static class Inner{
		
		int b = 20;
		
		static String field = "abc";
		
		public void m2(){
			System.out.println("Inner m2()");
		}
		
		public static void m3(){
			System.out.println(a);
		}
		
	}
	
	static void m1(){
		System.out.println("Outer m1()");
	}
	
}