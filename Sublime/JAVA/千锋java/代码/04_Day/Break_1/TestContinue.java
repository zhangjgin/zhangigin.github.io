import java.util.Scanner;

public class TestContinue{
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		//如果输入过程中，存在非法数据，则重新录入此成绩
		
		double sum = 0D;
		
		for(int i = 1 ; i <= 5 ; ){
			System.out.print("请输入第" + i + "位学生成绩：");
			
			double score = input.nextDouble();
			
			if(score < 0 || score > 100){
				continue;
			}
			
			sum += score;
			
			i++;
		}
		
		
		double avg = sum / 5;
		System.out.println("平均分为：" + avg);
		
	}
}