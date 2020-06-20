public class TestCreateArray{
	public static void main(String[] args){
		
		
		int[] nums = new int[5];
		
		nums[0] = 10;//赋值
		
		System.out.println(nums[0]);//取值
		
		int sum = nums[0] + 5;//取值
		
		System.out.println(sum);
		
		
		nums[1] = 20;
		nums[2] = 35;
		nums[3] = 43;
		nums[4] = 50;
		
		System.out.println(nums[1]);
		System.out.println(nums[2]);
		System.out.println(nums[3]);
		System.out.println(nums[4]);
		 
		 
		System.out.println(nums[5]);
	}
}