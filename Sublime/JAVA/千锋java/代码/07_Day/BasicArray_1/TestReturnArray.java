public class TestReturnArray{
	public static void main(String[] args){
		/*
		int[] nums = {11,22,33,44,55};
		
		int[] newNums = copyOf(nums , nums.length * 2);
		
		
		for(int i = 0 ; i < newNums.length ; i++){
			System.out.print(newNums[i] +"\t");
		}
		*/
		
		int[] scores = {99,88,99,88,77,-1,-1,-1};
		
		addElement(scores , 0 , 100 , -1);
		
		printArray(scores);
		
	}
	
	//����һ���������飬������һ������İ���ԭ��Ԫ�ص�������
	public static int[] copyOf(int[] array , int length){
		
		int[] newArray = new int[length];
		
		for(int i = 0 ; i < array.length ; i++){
			newArray[i] = array[i];
		}
		
		return newArray;
	}
	
	public static int[] initial(int[] nums , int flag){//-123456
		for(){

			
		}
	}
	
	//�����Ԫ��
	public static void addElement(int[] array , int position , int value , int flag){//��Ч����
		boolean tag = false;//û�п��ÿռ�
		int size = array.length;//��ЧԪ�ظ���
		//1.����û�п��ÿռ䣨���ݣ�
		for(int i = 0 ; i < array.length ; i++){
			if(array[i] == flag){
				tag = true;//�п��ÿռ�
				size = i;
				break;
			}
		}
		
		if(!tag){
			//expand();
		}
		
		
		//2.��֤�Ƿ�Ϊ��Чλ�ã�0 ~ ��һ��flag��
		if(position < 0 || position > size){
			return;
		}
		
		//3.�ƶ�Ԫ��
		for(int i = size - 1; i >= position ; i--){
			array[i+1] = array[i];
		}

		//4.Ŀ��λ�ø���ֵ
		array[position] = value;
		
	}
	
	
	//�����ԣ�ͨ�ã�
	public static void printArray(int[] array){
		for(int i = 0 ; i < array.length ; i++){
			System.out.print(array[i] +"\t");
		}
		System.out.println();
	}
}`





