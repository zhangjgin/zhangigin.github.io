package member;

public class TestMemberClass {
	public static void main(String[] args) {
		//Inner in = new Inner();//Error ���������ⲿ��������������
		
		Outer out = new Outer();
		
		//������Ա�ڲ���Ķ��󣨱��������ⲿ�����
		Outer.Inner in = out.new Inner();
		
		//System.out.println(in.b);
		
		in.m2();
		
		//System.out.println(out.a);//Error ��װ������Ч���޷����ⲿֱ�ӷ���

		//Outer.Inner.field //Error �޷������ⲿ�������о�̬�ĵ���
	}
}

class Outer{
	
	private int a = 10;
	
	//��Ա�ڲ��࣬�����ⲿ�����
	class Inner{
		
		int a = 20;
		
		/*static*/ String field = "abc";//��Ա�ڲ��಻�ܶ��徲̬��Ա	
		
		public void m2(){
			int a = 30;
			System.out.println("inner method - m2() " + a);//�ڲ����������ֲ�����
			System.out.println("inner method - m2() " + this.a);//�ڲ�����Է����ڲ����ʵ������
			System.out.println("inner method - m2() " + Outer.this.a);//�ڲ�����Է����ⲿ��ʵ������
		}
		
	}
}



