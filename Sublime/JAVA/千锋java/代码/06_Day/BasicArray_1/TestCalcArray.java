public class TestCalcArray{
	public static void main(String[] args){
		
		int[] nums = new int[]{11,22,33,44,55};
		
		int sum = 0;
		for(int i = 0 ; i < nums.length ; i++){
			sum += nums[i];
		}
		
		System.out.println( sum / nums.length);
		
	}
}