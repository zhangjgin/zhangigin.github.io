import java.util.Scanner;
public class LeapYear{
	public void Leap(){
		Scanner s = new Scanner(System.in);
		while(true){
			System.out.print("��������ݣ�");
			int year = s.nextInt();
			if(year == 0){
				System.out.println("abnormal");
			}else{
			if(year % 4 == 0  || year % 400 == 0 ){
				System.out.println(year +"������");

			}else{
				System.out.println(year+"��������");
			}
			}
		}
	}
	public static void main(String[] args){
		LeapYear years = new LeapYear();
		years.Leap();
	}
}
