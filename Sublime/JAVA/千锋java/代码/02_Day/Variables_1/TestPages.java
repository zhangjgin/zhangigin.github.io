public class TestPages{
	public static void main(String[] args){
		
		//������
		int totalCount = 23;
		
		//��ҳ��ʾ����
		int singlePage = 5;
		
		//��ǰҳ��
		int pageIndex = 5;//input.nextInt();
		
		//��ҳ��
		int totalPages = totalCount % singlePage == 0 ? totalCount / singlePage : totalCount / singlePage + 1 ;
		
		//��ʼ��
		int start = (pageIndex - 1) * singlePage + 1;//��ǰһҳ�����һ��+1
		
		//������
		int end = pageIndex == totalPages ? totalCount : pageIndex * singlePage;
		
		System.out.println(start +" ---> "+ end);
	}
}