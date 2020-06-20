
public class Summation{
	public static void main(String[] args){
		/*int num = 1;      //1到100的和
		int sum = 0;
		while(num <= 100){
			sum += num;
			num++;
		}
		System.out.println(sum);*/
		int i = 0;                                  //300以内能被3整除但不能被7整除的数有哪些？
		while(i < 300){
			if(i % 7 != 0){
				System.out.println(i);
			}
			i +=3;
		}
	}

} 