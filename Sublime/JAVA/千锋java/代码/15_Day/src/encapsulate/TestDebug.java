package encapsulate;

public class TestDebug {

	public static void main(String[] args) {

		System.out.println("Hello");
		
		int[] nums = {11,22,33,44,55};
		
		for(int i = 0 ; i < nums.length - 1 ; i++){
			for(int j = 0 ; j < nums.length - 1 - i ; j++){//j=4
				if(nums[j] > nums[j+1]){
					int temp = nums[j];
					nums[j] = nums[j+1];
					nums[j+1] = temp;
				}
			}
		}
		
	}

}
