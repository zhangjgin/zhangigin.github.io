public class TestArrayArgs{
	public static void main(String[] args){
		
		int a = 10;//ջ
		
		int b = a;//��ֵ == ����
		
		a++;
		
		System.out.println(a);
		System.out.println(b);
		
		//�������͵ĸ�ֵ�ȼ��ڡ�ֵ�ġ����ƣ�һ���ĸı䣬����Ӱ����һ����
		//�������͵ĸ�ֵ�ȼ��ڡ���ַ�ġ����ƣ�һ���ĸı䣬��Ӱ����һ���������е����鱻����
		
		
		
		int[] oldArray = new int[4];//0x11223344
		
		oldArray[0] = 10;
		
		System.out.println(oldArray[0]);
		
		int[] newArray = oldArray;
		
		newArray[0] = 20;
		
		System.out.println(newArray[0]);
		
		System.out.println(oldArray[0]);
		
	}
}