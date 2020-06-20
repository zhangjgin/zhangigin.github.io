
public class Test{
	public static void main(String[] args){
		int[] arr ={23,12,45,62,11,78,90};

		int  max = arr[0];
		for (int i=1; i<arr.length; i++) {
		 	if (max < arr[i]) {
		 	 	max = arr[i];
		 	}
		}
		 	System.out.println(max);
		} 
		
	
}