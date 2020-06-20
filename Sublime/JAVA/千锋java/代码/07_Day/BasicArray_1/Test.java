public class Test{
	public static void main(String[] args){
		
		//int n = 10;
		
		//m1(n);
		
		//System.out.println(n);
		
		//n = m2(n);
		
		//System.out.println(result);//
		
		//int[] array = {11,22,33};//0x1234
		
		//m3(array);
		
		//System.out.println(array[0]);
		
		int[] form = {1,2,3,4,5};
		
		m4(form);
		
		System.out.println(form[0]);
		
	}
	
	public static void m1(int n){
		n++;
	}
	
	public static int m2(int n){
		return 50;
	}
	
	public static void m3(int[] nums){//1234
		nums = java.util.Arrays.copyOf(nums,nums.length*2);//0x5678
		nums[0] = 88;
	}

	public static void m4(int[] to){
		to[0] = 888;
	}
}
