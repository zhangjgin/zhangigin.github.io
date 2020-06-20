public class TestList{
	
	static int[] nums = new int[5];//0x0000A001
	
	static int size = 0;//��ЧԪ�صĸ�����Ҳ���Դ�����һ����ЧԪ�صĲ���λ�ã��±꣩
	
	public static void main(String[] args){
		
		insert(0,11);
		insert(1,22);
		insert(2,33);
		insert(3,44);
		insert(4,55);
		
		print();
		
		insert(0,66);
		
		print();
		
		replace(0,88);
		
		print();
		
		remove(2);
		
		print();
		
		remove(0);
		
		print();
		
		remove(3);
		
		print();
	}
	
	//�������в���һ����Ԫ��
	public static void insert(int position , int value){//position = 2	

		if(position < 0 || position > size){
			System.out.println("���ã��û����������λ������������һ����0~"+size+"֮�������");
			return;
		}
		
		if(nums.length == size ){
			expand();
		}
		
		//��ԭ�������������ƶ�
		for(int i = size; i > position ; i--){//i = 4
			nums[i] = nums[i-1];
		}
		
		//��ֵ����Ŀ��λ��
		nums[position] = value;
		
		size++;
	}
	
	//�Ƴ�
	public static void remove(int position){//9
		
		//ѭ���ƶ�Ԫ��
		for(int i = position ; i < size - 1 ; i++){
			nums[i] = nums[i+1];
		}
		
		size--;
	}
	
	//�滻
	public static void replace(int position , int value){
		if(position < 0 || position >= size){
			System.out.println("���ã��û����������λ������������һ����0~"+(size-1)+"֮�������");
			return;
		}
		
		nums[position] = value;
	}
	
	//���������
	public static void expand(){
		//��������飨����ԭֵ��
		int[] newArray = new int[ nums.length * 2];//0x0000B002
		
		for(int i = 0 ; i < nums.length ; i++){
			newArray[i] = nums[i];
		}
		
		//�滻nums�����еĵ�ַ����Ϊ�滻���ã�
		//���壺��ԭnums��ָ�򳤶�Ϊ5�����飬�滻������ָ�򳤶�Ϊ10��������
		nums = newArray;
	}
	
	//����nums����
	public static void print(){
		for(int i = 0 ; i < size ; i++){
			System.out.print(nums[i] +"\t");
		}
		System.out.println();
	}
	
}