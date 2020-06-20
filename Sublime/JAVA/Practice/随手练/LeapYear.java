import java.util.Scanner;
public class LeapYear{
	public void Leap(){
		Scanner s = new Scanner(System.in);
		while(true){
			System.out.print("请输入年份：");
			int year = s.nextInt();
			if(year == 0){
				System.out.println("abnormal");
			}else{
			if(year % 4 == 0  || year % 400 == 0 ){
				System.out.println(year +"是闰年");

			}else{
				System.out.println(year+"不是闰年");
			}
			}
		}
	}
	public static void main(String[] args){
		LeapYear years = new LeapYear();
		years.Leap();
	}
}
