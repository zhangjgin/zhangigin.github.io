public class TestExpand3{
	public static void main(String[] args){
		
		java.util.Scanner input = new java.util.Scanner(System.in);
		
		//ԭ����
		int[] oldArray = new int[]{11,22,33,44,55};
		
		//���ݲ���1��������ԭ�������������顢��ԭ�����Ԫ�أ����θ��Ƶ���������
		int[] newArray = java.util.Arrays.copyOf(oldArray , oldArray.length * 2);
		
		//��������
		for(int i = 0 ; i < newArray.length ; i++){
			System.out.print(newArray[i] +"\t");
		}
		System.out.println();
	}
}