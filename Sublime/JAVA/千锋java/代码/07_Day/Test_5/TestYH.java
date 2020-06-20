public class TestYH{
	
	public static void main(String[] args){
		
		int rows = 7;
		
		int[][] yh = new int[rows][];
		
		
		for(int i = 0 ; i < rows ; i++){
			yh[i] = new int[i+1];
		}
		
		//已知值的赋值操作
		
		for(int i = 0 ; i < yh.length ; i++){//i = 2
			yh[i][0] = 1;		
			yh[i][i] = 1;
		}
		
		//计算
		for(int i = 2 ; i < yh.length ; i++){//i=4
			for(int j = 1 ; j < i ; j++){//j=3
				yh[i][j] = yh[i-1][j] + yh[i-1][j-1];
			}
		}
		
		
		
		
		//打印
		for(int i = 0 ; i < yh.length ; i++){
			
			//倒三角
			
			
			for(int j = 0 ; j < yh[i].length ; j++){
				System.out.print(yh[i][j] +"\t");
			}
			System.out.println();
		}
		
	}
	
}