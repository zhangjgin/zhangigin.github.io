public class TestConvertion{
	public static void main(String[] args){
		
		short s = 123;
		
		int i = s;//Ŀ�����ʹ���Դ����
		
		System.out.println(i);
		
		
		double d = i;
		
		System.out.println(d);
		
		short num = 123;
		
		byte target = (byte)num;
		
		System.out.println(target);
		
		
		//С��ǿתΪ����
		
		double x = 12.34;
		int y = (int)x;
		System.out.println(y);
		
		
		
		//����ǿתΪ�����������С������ţ�
		short m = 258;
		byte n = (byte)m;
		System.out.println(n);
		
		
		//short 258		0000 0001 1000 0010
		//byte  				  1000 0010
		
		
		int a = -65;
		
		char b = (char)a;
		
		System.out.println(b);
	}
}