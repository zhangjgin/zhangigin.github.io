/**
	银行案例的测试类（程序的起始）
*/
public class TestBank{
	
	//static User u1;//null
	
	
	public static void main(String[] args){
		
		Bank bank = new Bank();//创建了一家银行网点
		
		bank.users = null;
		
		bank.showAll();
		
		bank.welcomeMenu();
		
		bank.showAll();
		
		
		//System.out.println(u1.getBalance());
		
		//User u2 = null;//new User();  user.balance
		
		//System.out.println(u2.getBalance());
	}
}

