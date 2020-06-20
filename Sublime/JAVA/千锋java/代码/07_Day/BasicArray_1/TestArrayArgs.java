public class TestArrayArgs{
	public static void main(String[] args){
		
		int a = 10;//栈
		
		int b = a;//赋值 == 复制
		
		a++;
		
		System.out.println(a);
		System.out.println(b);
		
		//基本类型的赋值等价于“值的”复制，一方的改变，不会影响另一方。
		//引用类型的赋值等价于“地址的”复制，一方的改变，会影响另一方。（堆中的数组被共享）
		
		
		
		int[] oldArray = new int[4];//0x11223344
		
		oldArray[0] = 10;
		
		System.out.println(oldArray[0]);
		
		int[] newArray = oldArray;
		
		newArray[0] = 20;
		
		System.out.println(newArray[0]);
		
		System.out.println(oldArray[0]);
		
	}
}