import java.util.Scanner;

public class TestShowDetails{
	
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		//控制台录入5名学生成绩，并保存在数组中
		
		double[] scores = new double[5];
		
		System.out.println(scores.length);
		
		
		//存
		for(int i = 0 ; i < scores.length ; i++){// 0 1 2 3 4 
			System.out.println("请输入第" + (i+1) + "名学生成绩");
			scores[i] = input.nextDouble();
		}
		
		//取
		for(int i = 0 ; i < scores.length ; i++){
			scores[i] += 1;
			System.out.println(scores[i]);
		}

		
	}
	
}