public class TestBubbleSort{
	public static void main(String[] args){
		
		//���ڵ�����ֵ�Ƚϴ�С������λ�á�������
		
		int[] nums = {4,3,5,2,1};
		
		/*
		
		//��һ��
		for(int j = 0; j < nums.length - 1; j++ ){
			if(nums[j] > nums[j+1]){
				int temp = nums[j];
				nums[j] = nums[j+1];
				nums[j+1] = temp;
			}
		}
		
		printArray(nums);
		
		//�ڶ���
		for(int j = 0; j < nums.length - 1 - 1; j++ ){
			if(nums[j] > nums[j+1]){
				int temp = nums[j];
				nums[j] = nums[j+1];
				nums[j+1] = temp;
			}
		}
		
		printArray(nums);

		//������
		for(int j = 0; j < nums.length - 1 - 2; j++ ){
			if(nums[j] > nums[j+1]){
				int temp = nums[j];
				nums[j] = nums[j+1];
				nums[j+1] = temp;
			}
		}
		
		printArray(nums);
		
		//������
		for(int j = 0; j < nums.length - 1 - 3; j++ ){
			if(nums[j] > nums[j+1]){
				int temp = nums[j];
				nums[j] = nums[j+1];
				nums[j+1] = temp;
			}
		}
		
		printArray(nums);
		
		*/
		
		//�ۺϰ棨length - 1 �� length - 1 - i��
		for(int i = 0 ; i < nums.length - 1 ; i++){//i=1
		
			//�ڲ㣨һ�֣�
			for(int j = 0; j < nums.length - 1 - i; j++ ){
				if(nums[j] < nums[j+1]){
					int temp = nums[j];
					nums[j] = nums[j+1];
					nums[j+1] = temp;
				}
			}
		}
		
		printArray(nums);

	}
	
	public static void printArray(int[] nums){
		for(int i = 0 ; i < nums.length ; i++){
			System.out.print(nums[i] +"\t");
		}
		System.out.println();
	}
}