import java.util.Scanner;

public class TestGetAvg{
	public static void main (String[] args){
		
		Scanner input = new Scanner(System.in);
		
		int count = 5;//input.nextInt();
		
		double sum = 0D;
		
		for(int i = 1 ; i <= count ; i++){
			
			System.out.print("请输入第" + i + "位同学成绩：");
			
			double score = input.nextDouble();
			
			sum += score;
			
		}
		
		double avg = sum / count;
		
		System.out.println(avg);
	}
}