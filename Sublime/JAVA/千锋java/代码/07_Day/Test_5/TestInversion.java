public class TestInversion{
	public static void main(String[] args){
		
		int[] array = {1,3,4,6,5,7};//6 5 4 3 2 1
		
		
		java.util.Arrays.sort(array);
		
		
		for(int i = 0 ; i < array.length / 2 ; i++){//i=0
			
			//交换(整数第一 与 倒数第一)
			
			int temp = array[i];
			
			array[i] = array[ array.length - 1 - i];
			
			array[ array.length - 1 - i] = temp;
			
		}
		
		
		for(int i = 0 ; i < array.length ; i++){
			System.out.print(array[i] +"\t");
		}
		
	}
}