
public class Summation{
	public static void main(String[] args){
		/*int num = 1;      //1��100�ĺ�
		int sum = 0;
		while(num <= 100){
			sum += num;
			num++;
		}
		System.out.println(sum);*/
		int i = 0;                                  //300�����ܱ�3���������ܱ�7������������Щ��
		while(i < 300){
			if(i % 7 != 0){
				System.out.println(i);
			}
			i +=3;
		}
	}

} 