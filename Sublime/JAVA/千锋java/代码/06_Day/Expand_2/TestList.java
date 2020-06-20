public class TestList{
	
	static int[] nums = new int[5];//0x0000A001
	
	static int size = 0;//有效元素的个数，也可以代表下一个无效元素的插入位置（下标）
	
	public static void main(String[] args){
		
		insert(0,11);
		insert(1,22);
		insert(2,33);
		insert(3,44);
		insert(4,55);
		
		print();
		
		insert(0,66);
		
		print();
		
		replace(0,88);
		
		print();
		
		remove(2);
		
		print();
		
		remove(0);
		
		print();
		
		remove(3);
		
		print();
	}
	
	//向数组中插入一个新元素
	public static void insert(int position , int value){//position = 2	

		if(position < 0 || position > size){
			System.out.println("您好，用户，您输入的位置有误，请输入一个从0~"+size+"之间的整数");
			return;
		}
		
		if(nums.length == size ){
			expand();
		}
		
		//将原数据依次向右移动
		for(int i = size; i > position ; i--){//i = 4
			nums[i] = nums[i-1];
		}
		
		//新值存入目标位置
		nums[position] = value;
		
		size++;
	}
	
	//移除
	public static void remove(int position){//9
		
		//循环移动元素
		for(int i = position ; i < size - 1 ; i++){
			nums[i] = nums[i+1];
		}
		
		size--;
	}
	
	//替换
	public static void replace(int position , int value){
		if(position < 0 || position >= size){
			System.out.println("您好，用户，您输入的位置有误，请输入一个从0~"+(size-1)+"之间的整数");
			return;
		}
		
		nums[position] = value;
	}
	
	//数组的扩容
	public static void expand(){
		//获得新数组（带有原值）
		int[] newArray = new int[ nums.length * 2];//0x0000B002
		
		for(int i = 0 ; i < nums.length ; i++){
			newArray[i] = nums[i];
		}
		
		//替换nums变量中的地址（称为替换引用）
		//含义：将原nums中指向长度为5的数组，替换成现在指向长度为10的新数组
		nums = newArray;
	}
	
	//遍历nums数组
	public static void print(){
		for(int i = 0 ; i < size ; i++){
			System.out.print(nums[i] +"\t");
		}
		System.out.println();
	}
	
}