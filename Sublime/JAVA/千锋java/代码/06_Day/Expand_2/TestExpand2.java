public class TestExpand2{
	public static void main(String[] args){
		
		//原数组
		int[] oldArray = new int[]{11,22,33,44,55};
		
		//扩容步骤1：创建比原数组更大的新数组
		int[] newArray = new int[ oldArray.length * 2 ];
		
		//扩容步骤2：将原数组的元素，依次复制到新数组中
		System.arraycopy(oldArray , 0 , newArray , 0 , oldArray.length);
		
		//遍历访问
		for(int i = 0 ; i < newArray.length ; i++){
			System.out.print(newArray[i] +"\t");
		}
		System.out.println();
		
	}
}