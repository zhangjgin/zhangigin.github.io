import java.util.Scanner;


public class TestMultiply{
	
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("������һ����Ҫ����׳˵�ֵ��");
		
		int num = input.nextInt();
		
		
		int sum = 1;//ע��

		for(int i = 1 ; i <= num ; i++){
			sum = sum * i;
		}
		
		System.out.println(sum);
		

	}
	
}