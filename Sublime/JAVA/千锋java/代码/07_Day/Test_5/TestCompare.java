public class TestCompare{
	public static void main(String[] args){
		
		int[] nums = {-1,-3,-5,-2,-4};
		
		int max = nums[0];
		int min = nums[0];
		
		
		for(int i = 1 ; i < nums.length ; i++){
			
			if(nums[i] > max){
				max = nums[i];
			}
			
			if(nums[i] < min){
				min = nums[i];
			}
			
		}
		
		System.out.println(max);
		System.out.println(min);
	}
}