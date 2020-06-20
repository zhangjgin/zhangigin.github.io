import java.util.Scanner;

public class TestPages2{
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		
		//总行数
		int totalCount = 23;
		
		//单页显示行数
		int singlePage = 5;
		
		System.out.println("请输入需要访问的页码：");
		//当前页码
		int pageIndex = input.nextInt();
		
		//总页数
		int totalPages = 0;
		
		if(totalCount % singlePage == 0){
			totalPages = totalCount / singlePage;
		}else{
			totalPages = totalCount / singlePage + 1 ;
		}
		
		//起始行
		int start = (pageIndex - 1) * singlePage + 1;//在前一页的最后一行+1
		
		//结束行
		int end = 0;

		if(pageIndex == totalPages){
			end = totalCount;
		}else{
			end = pageIndex * singlePage;
		}
		
		System.out.println(start +" ---> "+ end);
	}
}