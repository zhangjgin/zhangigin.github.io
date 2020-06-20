public class Test2DArray{
	public static void main(String[] args){
		
		//高维、低维
		int[][] nums = new int[3][5];
		
		nums[0][0] = 10;
		nums[0][1] = 20;
		nums[0][2] = 30;
		nums[0][3] = 40;
		nums[0][4] = 50;
		
		nums[1][0] = 100;
		nums[1][1] = 200;
		nums[1][2] = 300;
		nums[1][3] = 400;
		nums[1][4] = 500;
		
		nums[2][0] = 1000;
		nums[2][1] = 2000;
		nums[2][2] = 3000;
		nums[2][3] = 4000;
		nums[2][4] = 5000;
		
		
	
		/*
		int[] a = new int[5];
		int[] array = new int[5];
		
		
		a.length
		array.length
		nums[0].length
		*/
		
		//nums[i][j]
		
		
		for(int i = 0 ; i < nums.length ; i++){//i = 2  确定需要遍历的高维的下标
			
			for(int j = 0; j < nums[i].length ; j++){
				System.out.print( nums[i][j] +"\t" );
			}
			System.out.println();
			
		}
		
		
	}
}