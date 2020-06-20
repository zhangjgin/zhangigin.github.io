import java.util.*;

public class TestMenu{
	
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("------欢迎使用ATM自助银行服务------");
		
		int choice = 0;
		
		int count = 0;
		
		do{
			System.out.println("1.开户 2.存款 3.取款 4.转账 5.查询余额 6.修改密码 0.退出");
			
			System.out.println("-----------------------------------");
			
			System.out.print("请输入操作编号：");
			
			choice = input.nextInt();
			
			switch(choice){
				case 0:
					System.out.println("执行退出操作");
					return;
				case 1:
					System.out.println("执行开户操作");
					break;
				case 2:
					System.out.println("执行存款操作");
					break;
				case 3:
					System.out.println("执行取款操作");
					break;
				case 4:
					System.out.println("执行转账操作");
					break;
				case 5:
					System.out.println("执行查询余额操作");
					break;
				case 6:
					System.out.println("执行修改密码操作");
					break;
				default:
					System.out.println("输入有误，请重新输入！");
					count++;
					break;
			}
			
			System.out.println("switch结束");
			
			if(count == 3){
				break;
			}
			
			System.out.println("错误次数判断结束");

		}while(choice < 0 || choice > 6);
		
		System.out.println("程序结束");
		
	}
}