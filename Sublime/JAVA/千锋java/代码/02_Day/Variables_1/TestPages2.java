import java.util.Scanner;

public class TestPages2{
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		
		//������
		int totalCount = 23;
		
		//��ҳ��ʾ����
		int singlePage = 5;
		
		System.out.println("��������Ҫ���ʵ�ҳ�룺");
		//��ǰҳ��
		int pageIndex = input.nextInt();
		
		//��ҳ��
		int totalPages = 0;
		
		if(totalCount % singlePage == 0){
			totalPages = totalCount / singlePage;
		}else{
			totalPages = totalCount / singlePage + 1 ;
		}
		
		//��ʼ��
		int start = (pageIndex - 1) * singlePage + 1;//��ǰһҳ�����һ��+1
		
		//������
		int end = 0;

		if(pageIndex == totalPages){
			end = totalCount;
		}else{
			end = pageIndex * singlePage;
		}
		
		System.out.println(start +" ---> "+ end);
	}
}