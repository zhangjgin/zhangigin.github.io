import java.util.Scanner;

public class TestBreak{
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		//如果输入过程中，存在非法数据，则整班成绩作废。
		
		
		boolean flag = true;//true代表合法
		
		double sum = 0D;
		
		for(int i = 1 ; i <= 5 ; i++){
			System.out.print("请输入第" + i + "位学生成绩：");
			
			double score = input.nextDouble();
			
			if(score < 0 || score > 100){
				flag = false;//存在非法数据
				break;
			}
			
			sum += score;
		}
		
		
		if(flag){//flag == true
			double avg = sum / 5;
			System.out.println("平均分为：" + avg);
		}else{
			System.out.println("输入有误，请重新输入！");
		}
		
		
	}
}