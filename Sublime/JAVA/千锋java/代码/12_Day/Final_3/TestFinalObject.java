public class TestFinalObject{
	public static void main(String[] args){
		
		final int[] nums = new int[]{11,22,33};
		//nums[0] = 88;
		//System.out.println(nums[0]);
		//m1(nums);
		//m2(nums);
		
		final Student s = new Student();
		
		
	}
	
	public static void m1(int[] nums){
		nums = new int[5];
	}
	
	public static void m2(final int[] array){
		array[0] = 99;
	}
	
	public static void m3(final Student s){
		s.name = "tom"
	}
}

class Student{
	final String name = "jack";
}