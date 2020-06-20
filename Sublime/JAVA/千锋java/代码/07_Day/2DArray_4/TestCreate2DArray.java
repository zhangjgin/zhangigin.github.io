public class TestCreate2DArray{
	public static void main(String[] args){
		
		//高维、低维
		int[][] nums = new int[][]{ {1,2,3},{4,5,6,88},{7,8,9},{10,11,12,13,14} };
		
	
		for(int i = 0 ; i < nums.length ; i++){//i = 2  确定需要遍历的高维的下标
			
			for(int j = 0; j < nums[i].length ; j++){
				System.out.print( nums[i][j] +"\t" );
			}
			System.out.println();
			
		}
		
		
		
		int[][] array = new int[3][];
		
		//System.out.println(array[0][0]);//Error
		System.out.println(array[0]);
		System.out.println(array[1]);
		System.out.println(array[2]);
		
		
		array[0] = new int[3];
		array[1] = new int[4];
		array[2] = new int[5];
		
		
		System.out.println(array[0]);
		System.out.println(array[1]);
		System.out.println(array[2]);
		
		
		for(int i = 0 ; i < array.length ; i++){//i = 2  确定需要遍历的高维的下标
			
			for(int j = 0; j < array[i].length ; j++){
				System.out.print( array[i][j] +"\t" );
			}
			System.out.println();
			
		}
		
		
		int rows = 7;
		
		int[][] yh = new int[rows][rows];
		
	}
}