public class TestExpand2{
	public static void main(String[] args){
		
		//ԭ����
		int[] oldArray = new int[]{11,22,33,44,55};
		
		//���ݲ���1��������ԭ��������������
		int[] newArray = new int[ oldArray.length * 2 ];
		
		//���ݲ���2����ԭ�����Ԫ�أ����θ��Ƶ���������
		System.arraycopy(oldArray , 0 , newArray , 0 , oldArray.length);
		
		//��������
		for(int i = 0 ; i < newArray.length ; i++){
			System.out.print(newArray[i] +"\t");
		}
		System.out.println();
		
	}
}