public class TestReturnArray{
	public static void main(String[] args){
		/*
		int[] nums = {11,22,33,44,55};
		
		int[] newNums = copyOf(nums , nums.length * 2);
		
		
		for(int i = 0 ; i < newNums.length ; i++){
			System.out.print(newNums[i] +"\t");
		}
		*/
		
		int[] scores = {99,88,99,88,77,-1,-1,-1};
		
		addElement(scores , 0 , 100 , -1);
		
		printArray(scores);
		
	}
	
	//接收一个整数数组，并返回一个更大的包含原有元素的新数组
	public static int[] copyOf(int[] array , int length){
		
		int[] newArray = new int[length];
		
		for(int i = 0 ; i < array.length ; i++){
			newArray[i] = array[i];
		}
		
		return newArray;
	}
	
	public static int[] initial(int[] nums , int flag){//-123456
		for(){

			
		}
	}
	
	//添加新元素
	public static void addElement(int[] array , int position , int value , int flag){//无效数据
		boolean tag = false;//没有可用空间
		int size = array.length;//有效元素个数
		//1.还有没有可用空间（扩容）
		for(int i = 0 ; i < array.length ; i++){
			if(array[i] == flag){
				tag = true;//有可用空间
				size = i;
				break;
			}
		}
		
		if(!tag){
			//expand();
		}
		
		
		//2.验证是否为有效位置（0 ~ 第一个flag）
		if(position < 0 || position > size){
			return;
		}
		
		//3.移动元素
		for(int i = size - 1; i >= position ; i--){
			array[i+1] = array[i];
		}

		//4.目标位置赋新值
		array[position] = value;
		
	}
	
	
	//普适性（通用）
	public static void printArray(int[] array){
		for(int i = 0 ; i < array.length ; i++){
			System.out.print(array[i] +"\t");
		}
		System.out.println();
	}
}`





