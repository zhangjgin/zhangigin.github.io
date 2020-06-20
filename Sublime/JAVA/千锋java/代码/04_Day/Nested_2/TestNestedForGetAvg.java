import java.util.Scanner;

public class TestNestedForGetAvg{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		//循环变量名：i   j   k
		
		
		//将内部代码反复执行3遍
		for(int i = 1 ; i <= 3 ; i++){
			
			//--求一个班5位同学的平局分------------------------------------
			double sum = 0D;
			
			for(int j = 1 ; j <= 5 ; j++ ){
				System.out.print("请输入第" + j + "位学生成绩：");
				
				double score = input.nextDouble();
				
				sum += score;
			}

			double avg = sum / 5;
			
			System.out.println("平均分为：" + avg);
			//-------------------------------------------------------------	
			
		}
		
		
	
	}
}