public class TestExpand3{
	public static void main(String[] args){
		
		java.util.Scanner input = new java.util.Scanner(System.in);
		
		//原数组
		int[] oldArray = new int[]{11,22,33,44,55};
		
		//扩容步骤1：创建比原数组更大的新数组、将原数组的元素，依次复制到新数组中
		int[] newArray = java.util.Arrays.copyOf(oldArray , oldArray.length * 2);
		
		//遍历访问
		for(int i = 0 ; i < newArray.length ; i++){
			System.out.print(newArray[i] +"\t");
		}
		System.out.println();
	}
}