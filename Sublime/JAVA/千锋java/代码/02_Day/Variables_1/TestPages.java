public class TestPages{
	public static void main(String[] args){
		
		//总行数
		int totalCount = 23;
		
		//单页显示行数
		int singlePage = 5;
		
		//当前页码
		int pageIndex = 5;//input.nextInt();
		
		//总页数
		int totalPages = totalCount % singlePage == 0 ? totalCount / singlePage : totalCount / singlePage + 1 ;
		
		//起始行
		int start = (pageIndex - 1) * singlePage + 1;//在前一页的最后一行+1
		
		//结束行
		int end = pageIndex == totalPages ? totalCount : pageIndex * singlePage;
		
		System.out.println(start +" ---> "+ end);
	}
}