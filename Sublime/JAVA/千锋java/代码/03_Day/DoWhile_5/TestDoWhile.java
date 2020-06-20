import java.util.Scanner;

public class TestDoWhile{
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		
		//Tom同学写作业，如果完成的不好，则重新抄写一遍。如果完成的好，则结束。
		
		char answer;//初始部分
		
		do{
			System.out.println("抄写一遍。。。好好学习，天天向上");//循环操作
			
			System.out.println("老师给予评价：");//循环操作
			
			answer = input.next().charAt(0);//迭代部分
		}while(answer != 'y');//循环条件
		
	}
}