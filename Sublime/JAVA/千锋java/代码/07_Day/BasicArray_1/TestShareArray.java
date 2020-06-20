public class TestShareArray{
	public static void main(String[] args){
		
		
		int[] nums = {11,22,33,44,55};//0x11223344
		
		printArray(nums);
		
		
		int[] numbers = {111,222,333,444,555,666,777,888};//0x55667788
		
		printArray(numbers);
		
		
		System.arraycopy(原数组,起始下标,新数组,起始下标,长度（个数）);
	}
	
	//普适性（通用）
	public static void printArray(int[] array){//0x55667788
		for(int i = 0 ; i < array.length ; i++){
			System.out.print(array[i] +"\t");
		}
		System.out.println();
	}
}