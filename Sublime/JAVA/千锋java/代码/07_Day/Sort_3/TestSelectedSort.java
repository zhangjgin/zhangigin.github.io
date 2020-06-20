public class TestSelectedSort{
	public static void main(String[] args){
		//固定值与其他值比较大小，互换位置。
		
		int[] nums = {4,3,5,2,1};
		
		/*
		//第一轮
		int i = 0;
		
		for(int j = i+1 ; j < nums.length ; j++){
			
			if(nums[i] > nums[j]){
				int temp = nums[i];
				nums[i] = nums[j];
				nums[j] = temp;
			}
		}
		
		
		i++;
		
		for(int j = i+1 ; j < nums.length ; j++){
			
			if(nums[i] > nums[j]){
				int temp = nums[i];
				nums[i] = nums[j];
				nums[j] = temp;
			}
		}
		
		printArray(nums);
		*/
		
		
		for(int i = 0 ; i < nums.length - 1 ; i++){
			
			for(int j = i+1 ; j < nums.length ; j++){
			
				if(nums[i] < nums[j]){
					int temp = nums[i];
					nums[i] = nums[j];
					nums[j] = temp;
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