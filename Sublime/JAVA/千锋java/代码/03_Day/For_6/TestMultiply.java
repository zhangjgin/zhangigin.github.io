import java.util.Scanner;


public class TestMultiply{
	
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("请输入一个需要计算阶乘的值：");
		
		int num = input.nextInt();
		
		
		int sum = 1;//注意

		for(int i = 1 ; i <= num ; i++){
			sum = sum * i;
		}
		
		System.out.println(sum);
		

	}
	
}