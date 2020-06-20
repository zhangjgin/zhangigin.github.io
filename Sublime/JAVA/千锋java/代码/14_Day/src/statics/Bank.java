package statics;

public class Bank {//银行功能业务模块

	public void login(){}

	private static class Information{
		private static User[] users = new User[5];//创建数组，为了存储已开户的用户信息
		
		static{
			users[0] = new User();
			users[1] = new User();
			users[2] = new User();
		}
	}
}

class User{}